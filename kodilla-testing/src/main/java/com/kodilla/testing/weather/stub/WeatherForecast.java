package com.kodilla.testing.weather.stub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            //adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1);
        }
        return resultMap;
    }

    public double calculateAverageTemp() {
        double sum = 0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            double temp = temperature.getValue();
            sum += temp;
        }
        return sum / temperatures.getTemperatures().entrySet().size();
    }

    public double calculateMedianTemp() {
        ArrayList<Double> tempList = new ArrayList<Double>();
        for (Map.Entry<String, Double> temperatures : temperatures.getTemperatures().entrySet()) {
            tempList.add(temperatures.getValue());
        }
        Collections.sort(tempList);

        if (tempList.size() % 2 == 0) {
            int n = tempList.size() / 2;
            return (tempList.get(n) + tempList.get(n + 1)) / 2;
        } else {
            return tempList.get((tempList.size() - 1) / 2);
        }

    }

}
