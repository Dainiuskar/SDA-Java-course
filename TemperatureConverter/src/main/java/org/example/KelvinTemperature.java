package org.example;

public class KelvinTemperature implements Temperature {

    private float temp;

    public KelvinTemperature(float temp) {
        this.temp = temp;
    }

    @Override
    public float ToCelsius() {
        return this.temp - 273.15f;
    }

    @Override
    public float FromCelsius(float celsius) {
        return celsius + 273.15f;
    }
}
