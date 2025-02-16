package org.example.observer;

import org.example.observable.WeatherData;

public class ThirdPartyDisplay implements Observer,Display{
    private Double temperature;
    private Double humidity;
    private final WeatherData weatherData;

    public ThirdPartyDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
    }
    @Override
    public void display() {
        System.out.println("Current temperature is, "+ temperature + " Current humidity is, "+ humidity);
    }

    @Override
    public void update() {
        System.out.println("Update invoked");
    temperature=weatherData.getTemperature();
    humidity=weatherData.getHumidity();
    display();
    }
}
