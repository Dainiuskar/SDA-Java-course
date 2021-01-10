package org.example;

public class TemperatureService {

    private final Temperature toTemperature;
    private final Temperature fromTemperature;

    public TemperatureService(Temperature fromTemperature,Temperature toTemperature) {
        this.toTemperature = toTemperature;
        this.fromTemperature = fromTemperature;
    }

    public float convertTemperature (){

        float celsius = fromTemperature.ToCelsius();
        return toTemperature.FromCelsius(celsius);
    }

}
