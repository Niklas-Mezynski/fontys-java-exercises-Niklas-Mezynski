package main.Impl;

import main.Observer;
import main.Subject;

import java.util.ArrayList;

public class WeatherDataSubj  implements Subject {

    private final ArrayList<Observer> observers;
    private double minTemp;
    private double maxTemp;
    private double currentTemp;

    public WeatherDataSubj() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(Observer::update);
    }


    public double getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(double currentTemp) {
        this.currentTemp = currentTemp;
        notifyObserver();
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
        notifyObserver();
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
        notifyObserver();
    }
}
