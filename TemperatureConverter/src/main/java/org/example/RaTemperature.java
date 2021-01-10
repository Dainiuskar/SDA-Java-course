package org.example;

public class RaTemperature implements Temperature{

    private float temp;

    public RaTemperature(float temp) {
        this.temp = temp;
    }

    @Override
    public float ToCelsius() {
        return this.temp - 272.59444444444f;
    }

    @Override
    public float FromCelsius(float celsius) {
        return celsius + 272.59444444444f;
    }
}
