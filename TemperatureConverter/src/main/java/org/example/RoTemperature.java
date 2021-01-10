package org.example;

public class RoTemperature implements Temperature {

    private float temp;

    public RoTemperature(float temp) {
        this.temp = temp;
    }

    @Override
    public float ToCelsius() {
        return (float) ((this.temp - 7.5) * 40 / 21);
    }

    @Override
    public float FromCelsius(float celsius) {
        return (float) ((celsius *21 / 40) +7.5);
    }
}
