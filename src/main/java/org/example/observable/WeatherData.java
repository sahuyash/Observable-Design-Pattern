package org.example.observable;

import org.example.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private final List<Observer> observerList ;
    private Double temperature;
    private Double humidity;
    private Double pressure;

    public WeatherData(){
        observerList= new ArrayList<>();
    }
    @Override
    public void notifyObservers() {
        for(Observer observer : observerList){
            observer.update();
        }
    }

    @Override
    public void addObserver(Observer observer) {
     observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
    observerList.remove(observer);
    }

    public void measurementChanged(){
        notifyObservers();
    }

    public void setMeasurement(Double temperature, Double pressure, Double humidity){
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity= humidity;
        measurementChanged();
    }

    public Double getTemperature(){
        return temperature;
    }

    public Double getHumidity(){
        return humidity;
    }

    public Double getPressure(){
        return pressure;
    }
}
