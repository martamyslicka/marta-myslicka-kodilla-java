package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.reference.BeautifierPoemMethods;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("FREEEEEDDDDDOOOOM!", BeautifierPoemMethods::addStars);
        poemBeautifier.beautify("I get it!", BeautifierPoemMethods::toUpper);
        poemBeautifier.beautify("I get it!", BeautifierPoemMethods::toUpper);
        poemBeautifier.beautify("Winter", BeautifierPoemMethods::almostWinter);

        }

    }


