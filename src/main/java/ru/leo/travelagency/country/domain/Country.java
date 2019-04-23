package ru.leo.travelagency.country.domain;


import ru.leo.travelagency.city.domain.City;
import ru.leo.travelagency.common.business.domain.BaseDomain;

import java.util.List;

public class Country extends BaseDomain<Long> {
    private String name;
    private String language;
    private List<City> cities;

    public Country() {
    }
    public Country(String name) {
        this.name = name;
    }

    public Country(String name, String language) {
        this.name = name;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "-----------------------\nCountry\n" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", \n\ncities:\n" + getCitiesAsStr();
    }

    private String getCitiesAsStr() {
        StringBuilder stringBuilder = new StringBuilder();
        for (City city : cities) {
            stringBuilder.append(city.toString()).append("\n");
        }

        return stringBuilder.toString();
    }
}
