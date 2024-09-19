package gr.aueb.cf.ch17.prct.clonedemo;

import java.util.Objects;

public class Trainee {
    private String name;
    private City city;

    public Trainee(String name, City city) {
        this.name = name;
        this.city = new City(city);
    }

    // copy constructor
    public Trainee(Trainee trainee) {
        this.name = trainee.name;
        this.city = new City(trainee.getCity());
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public City getCity() {return city;}

    public void setCity(City city) {this.city = city;}

    @Override
    public String toString() {
        return "Trainee{" +
                "name = '" + name + '\'' +
                ", city = " + city +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trainee trainee = (Trainee) o;
        return getName().equals(trainee.getName()) && Objects.equals(getCity(), trainee.getCity());
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(getName());
        result = 31 * result + Objects.hashCode(getCity());
        return result;
    }
}
