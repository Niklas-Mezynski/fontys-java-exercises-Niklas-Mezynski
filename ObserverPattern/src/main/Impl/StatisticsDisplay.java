package main.Impl;

import main.DisplayElement;
import main.Observer;

public class StatisticsDisplay implements DisplayElement, Observer {

    private final WeatherDataSubj weatherData;

    public StatisticsDisplay(WeatherDataSubj weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println(String.format("Todays min|max Temp: %1$s | %2$s", weatherData.getMinTemp(), weatherData.getMaxTemp()));
    }

    @Override
    public void update() {
        display();
    }
}
