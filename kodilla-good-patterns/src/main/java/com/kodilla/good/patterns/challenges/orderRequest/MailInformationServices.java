package com.kodilla.good.patterns.challenges.orderRequest;

public class MailInformationServices implements InformationServices {
    @Override
    public void inform(User user) {
        System.out.println("Sending mail to " + user.getName() + "(" + user.getMail() + ")");
    }
}
