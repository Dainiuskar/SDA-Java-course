package org.example;

public class CelsiusTemperature implements Temperature {

    private float temp;

    public CelsiusTemperature(float temp) {
        this.temp = temp;
    }

    @Override
    public float ToCelsius() {
        return this.temp;
    }

    @Override
    public float FromCelsius(float celsius) {
        return this.temp;
    }
}
