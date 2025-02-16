package org.example;

import org.example.observable.WeatherData;
import org.example.observer.ThirdPartyDisplay;

public class Main {
    public static void main(String[] args) {
        System.out.println("Observer Design Pattern");
        WeatherData weatherData= new WeatherData();
        ThirdPartyDisplay thirdPartyDisplay= new ThirdPartyDisplay( weatherData);
        weatherData.addObserver(thirdPartyDisplay);
        weatherData.setMeasurement(100.00,20.00,30.00);
        weatherData.setMeasurement(130.00,40.00,2.00);
    }
}