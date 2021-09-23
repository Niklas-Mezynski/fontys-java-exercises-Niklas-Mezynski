package main;

import main.Impl.CurrentTempDisplay;
import main.Impl.StatisticsDisplay;
import main.Impl.WeatherDataSubj;

public class Main {
    public static void main(String[] args) {
        WeatherDataSubj weatherData = new WeatherDataSubj();

        CurrentTempDisplay currentTempDisplay = new CurrentTempDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setCurrentTemp(22.5);
        System.out.println();

        weatherData.setMaxTemp(40);
        System.out.println();

        weatherData.setCurrentTemp(23.5);
        System.out.println();

        weatherData.removeObserver(statisticsDisplay);
        weatherData.setMinTemp(-12);
        System.out.println();


    }
}
