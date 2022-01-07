package com.kodilla.good.patterns.foodToDoor;

public class SmsInformation implements InformationService {
    @Override
    public void inform(String supplier) {
        System.out.println("Sending message to " + supplier +
                ": Hi there, F2D made a new order at " + supplier + ". Please confirm." );
    }
}
