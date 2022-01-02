package com.kodilla.exception.test;


public class ExceptionHandling {
    double x;
    double y;

    void example() {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(x, y));
        } catch (Exception e) {
            System.out.println("Exception occured: " + e);
        } finally {
            System.out.println("THE END");
        }

    }
}