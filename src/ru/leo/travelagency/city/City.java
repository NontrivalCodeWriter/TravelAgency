package ru.leo.travelagency.city;

public class City {
    private String name;
    private long population;
    private Boolean isCapital;

    public City(String name, long population, Boolean isCapital) {
        this.name = name;
        this.population = population;
        this.isCapital = isCapital;
    }

    public String getName() {
        return name;
    }

    public long getPopulation() {
        return population;
    }

    public Boolean getCapital() {
        return isCapital;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public void setCapital(Boolean capital) {
        isCapital = capital;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", isCapital=" + isCapital +
                '}';
    }
}
