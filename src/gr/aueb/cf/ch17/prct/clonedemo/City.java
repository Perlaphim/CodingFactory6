package gr.aueb.cf.ch17.prct.clonedemo;

import java.util.Objects;

public class City {
    private String description;

    public City(String description) {
        this.description = description;
    }

    public City(City city) {
        this.description = city.description;
    }

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    @Override
    public String toString() {
        return "City{" +
                "description = '" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return getDescription().equals(city.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getDescription());
    }
}
