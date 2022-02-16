package com.amigoscode.examples.interfaces.email;

public class GmailEmailService implements EmailSender {
    @Override
    public void send(String from, String to, String msg) {
        System.out.println("sending email using gmail");
    }
}
