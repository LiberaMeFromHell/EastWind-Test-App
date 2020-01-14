package ru.eastwind.weather.model;

public class Celsius implements Temperature {

    private float temperatureWinter;
    private float temperatureSpring;
    private float temperatureSummer;
    private float temperatureAutumn;

    public float getTemperatureWinter() {
        return temperatureWinter;
    }

    public float getTemperatureSpring() {
        return temperatureSpring;
    }

    public float getTemperatureSummer() {
        return temperatureSummer;
    }

    public float getTemperatureAutumn() {
        return temperatureAutumn;
    }
}
