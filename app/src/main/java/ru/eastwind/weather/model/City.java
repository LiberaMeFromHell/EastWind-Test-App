package ru.eastwind.weather.model;

public class City {

    private String name = "";
    private CityType cityType;
    private Temperature temperature;


    public City() {
    }

    public City(String name, CityType cityType, Temperature temperature) {
        this.name = name;
        this.cityType = cityType;
        this.temperature = temperature;
    }
}
