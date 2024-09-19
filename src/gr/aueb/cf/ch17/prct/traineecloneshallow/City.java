package gr.aueb.cf.ch17.prct.traineecloneshallow;

public class City implements Cloneable {
    private String description;

    public City(String name) {
        this.description = description;
    }

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    @Override
    protected City clone() throws CloneNotSupportedException {
        return (City) super.clone();
    }

    @Override
    public String toString() {
        return "City{" +
                "description = '" + description + '\'' +
                '}';
    }
}
