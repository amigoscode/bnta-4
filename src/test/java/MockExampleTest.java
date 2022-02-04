import com.amigoscode.examples.car_oop_example.Person;
import com.amigoscode.examples.car_oop_example.car.Car;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.util.Arrays;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

public class MockExampleTest {
    @Test
    void example() {
        // without mock
        System.out.println("without mock");
        Person robyn = new Person(
                "Robyn",
                24,
                "robyn@gmail.com",
                new Car[0]
        );

        System.out.println(robyn.getName());
        System.out.println(Arrays.toString(robyn.getCars()));

        // with mock
        System.out.println();
        System.out.println("with mock");
        Person marcy = Mockito.mock(Person.class);

        marcy.setAge(24);
//        given(marcy.getAge()).willReturn(100);

        given(marcy.getName()).willReturn("Hello", "Nasir");
        given(marcy.getCars()).willReturn(
                new Car[]{new Car("Testa", "123", true)}
        );

        System.out.println(marcy.getName());
        System.out.println(marcy.getName());
        System.out.println(marcy.getName());
        System.out.println(Arrays.toString(marcy.getCars()));

        verify(marcy).setAge(24);
        System.out.println(marcy.getAge());

    }
}
