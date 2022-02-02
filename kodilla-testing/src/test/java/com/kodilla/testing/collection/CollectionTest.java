package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTest {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("when create OddNumberExterminator with an empty list, " +
            "then exterminator should return an empty list"
    )

    @Test
    void testOddNumberExterminatorEmptyList() {

        //Given
        OddNumberExterminator exterminator = new OddNumberExterminator();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> expectedResult = new ArrayList<>();

        //When
        ArrayList<Integer> result = exterminator.exterminate(list);

        //Then
        Assertions.assertEquals(result, expectedResult);

    }

    @DisplayName("when create OddNumberExterminator with the list wit odd and even numbers, " +
            "then exterminator should return a list with even numbers"
    )

    @Test

    void testOddNumberExterminatorNormalList() {

        //Given
        OddNumberExterminator exterminator = new OddNumberExterminator();
        ArrayList<Integer> list = new ArrayList<> (Arrays.asList(69, 4568, 125874, 5, 98));
        ArrayList<Integer> expectedResult = new ArrayList<> ( Arrays.asList(4568, 125874, 98));

        //When
        ArrayList<Integer> result = exterminator.exterminate(list);

        //Then
        Assertions.assertEquals(result, expectedResult);

    }


}
