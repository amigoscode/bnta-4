package com.amigoscode.examples.mocking;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static com.amigoscode.examples.mocking.Destination.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

class FlightServiceTest {

    private FlightService underTest;
    private FlightDAO flightDAO;

    @BeforeEach
    void setUp() {
        flightDAO = Mockito.mock(FlightDAO.class);
        underTest = new FlightService(flightDAO);
    }

    @Test
    void canAddAFlight() {
        // Given
        Flight flight = new Flight("123", ITALIA, 1);

        // When
        underTest.addFlight(flight);

        // Then
        verify(flightDAO).saveFlightToFile(flight);
    }

    @Test
    void cannotAddAFlightWhenNoSeatsAvailable() {
        // Given
        Flight flight = new Flight("123", ITALIA, 0);

        // When
        assertThatThrownBy(() -> {
            underTest.addFlight(flight);
        }).hasMessage("Flight is full");

        // Then
        verify(flightDAO, never()).saveFlightToFile(flight);
    }

    @Test
    void canDisplayFlights() {
        // When
        underTest.displayAllFlights();

        // Then
        verify(flightDAO).getFlightsFromFile();
    }

    @Test
    void canDisplayFlightsFromItaly() {
        // Given
        Flight[] flights = {
                new Flight("123", ITALIA, 10),
                new Flight("123", US, 10),
                new Flight("123", PORTUGAL, 10)
        };

        Destination filter = ITALIA;

        given(flightDAO.getFlightsFromFile()).willReturn(flights);

        // When
        Flight[] actual = underTest.filterFlight(filter);

        // Then
        assertThat(actual).containsExactly(
                new Flight("123", ITALIA, 10)
        );
        verify(flightDAO).getFlightsFromFile();
        Mockito.verifyNoMoreInteractions(flightDAO);
    }
}