package com.kodilla.stream.array;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayTestSuite {

@Test
public void testGetAverage(){

    //given
    int numbers[] = {1,2,3,7,8,9};

    //when
    double average = Array.getAverage(numbers);
    double expectedAverage = 5.0;

    //then
    assertEquals(expectedAverage, average);


}

}
