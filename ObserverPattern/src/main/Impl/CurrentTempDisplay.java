package main.Impl;

import main.DisplayElement;
import main.Observer;
import main.Subject;

public class CurrentTempDisplay  implements DisplayElement, Observer {

    private final WeatherDataSubj weatherData;

    public CurrentTempDisplay(WeatherDataSubj weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(String.format("Current Temp is %1$s", weatherData.getCurrentTemp()));
    }

    @Override
    public void update() {
        display();
    }
}
