package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayName("Weather Forecast Test Suite")
public class WeatherForecastTestSuite{
    @Mock
    private Temperatures temperaturesMock;

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
    @BeforeEach
    void generateMock(){
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }

    @DisplayName("Calculate Forecast with Mock - test")
    @Test
    void testCalculateForecastWithMock(){
        //given
        //Temperatures temperaturesMock = mock(Temperatures.class);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //when
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @DisplayName("Calculate Average temp. with Mock - test")
    @Test
    void testCalculateAverageTemp(){
        //given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //when
        double average = weatherForecast.calculateAverageTemp();
        //then
        Assertions.assertEquals(25.56,average);
    }

    @DisplayName("Calculate Median temp. with Mock - test")
    @Test
    void testCalculateMedianTemp(){
        //given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //when
        double median = weatherForecast.calculateMedianTemp();
        //then
        Assertions.assertEquals(25.5,median);
    }

}
