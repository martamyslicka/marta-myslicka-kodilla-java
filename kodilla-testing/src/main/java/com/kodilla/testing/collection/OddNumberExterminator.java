package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumberExterminator {
    ArrayList<Integer> numbers;

    public ArrayList<Integer> exterminate (ArrayList<Integer> numbers){
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                numbers.remove(i);
            }
        }
        return numbers;

    }
}
