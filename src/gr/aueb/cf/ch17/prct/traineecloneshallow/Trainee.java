package gr.aueb.cf.ch17.prct.traineecloneshallow;

public class Trainee implements Cloneable{
    private String name;
    private City city;

    public Trainee() {}

    public Trainee(String name, City city) {
        this.name = name;
        this.city = city;
    }

    @Override
    protected Trainee clone() throws CloneNotSupportedException {
        return (Trainee) super.clone();
    }
}
