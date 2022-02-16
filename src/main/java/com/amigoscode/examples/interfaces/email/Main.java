package com.amigoscode.examples.interfaces.email;

public class Main {
    public static void main(String[] args) {

        EmailSender wendy = new WendyEmailService();
        EmailSender suraya = new SurayaEmailService();
        EmailSender gmail = new GmailEmailService();

        EmailService emailService = new EmailService(gmail);
        emailService.sendEmail("das", "dsa", "das");

    }
}
