package gr.aueb.cf.ch16.speakingAnimal;

public class Cat implements ISpeakable{
    private String name;

    public Cat() {}

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "(name = " + name  + ")";
    }

    @Override
    public void speak() {
        System.out.println(name + " says hi");
    }
}
