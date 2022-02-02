package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;



@DisplayName("TDD: Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is a beginning of test.");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("All test are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }


    @Nested
    @DisplayName("Tests related with displaying")
    class Browsing {
        @DisplayName("Displaying (n) shape from a figureList")
        @Test
        void testGetFigure() {
            //given
            ShapeCollector shape = new ShapeCollector();
            Shape circle = new Circle(6.5);
            Shape circle2 = new Circle(5);
            Shape square = new Square(65);
            shape.addShape(circle);
            shape.addShape(circle2);
            shape.addShape(square);
            //when
            Shape result = shape.getFigure(2);
            // then
            Assertions.assertEquals(result, square );

        }

        @DisplayName("Displaying a figureList as one String")
        @Test
        void testShowFigure() {
            //given
            ShapeCollector shape = new ShapeCollector();
            Shape circle = new Circle(6.5);
            Shape circle2 = new Circle(5);
            Shape square = new Square(65);
            shape.addShape(circle);
            shape.addShape(circle2);
            shape.addShape(square);
            //when
            String result = shape.showFigures();
            // then
            Assertions.assertEquals(result, "Circle, Circle, Square" );

        }

    }

    @Nested
    @DisplayName("Tests related with making-changes")
    class MakingChanges {

        @DisplayName("Adding shape to a figureList")
        @Test
        void testAddFigure() {
            //given
            ShapeCollector shape = new ShapeCollector();
            //when
            Shape triangle = new Triangle(6.5);
            boolean result = shape.addShape(triangle);
            //Then
            Assertions.assertTrue(result);

        }

        @DisplayName("Removing shape from a figureList")
        @Test
        void testRemoveFigure() {
            //given
            ShapeCollector shape = new ShapeCollector();
            Shape circle = new Circle(6.5);
            shape.addShape(circle);
            //when
            boolean result =shape.removeShape(circle);
            // then
            Assertions.assertTrue(result);

        }

    }
}