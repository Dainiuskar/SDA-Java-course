package org.example;

public class FahrenheitTemperature implements Temperature {

    private float temp;

    public FahrenheitTemperature(float temp) {
        this.temp = temp;
    }

    @Override
    public float ToCelsius() {
        return (float) ((this.temp-32)/1.8);
    }

    @Override
    public float FromCelsius(float celsius) {
        return (float) ((celsius * 1.8) + 32);
    }
}
