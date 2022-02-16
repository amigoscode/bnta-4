package com.amigoscode.examples.interfaces.email;

public class SurayaEmailService implements EmailSender {
    @Override
    public void send(String from, String to, String msg) {
        System.out.println("sending email using suraya");
    }
}
