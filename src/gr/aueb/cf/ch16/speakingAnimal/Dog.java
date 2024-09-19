package gr.aueb.cf.ch16.speakingAnimal;

public class Dog implements ISpeakable{
    private String name;
    private int age;

    public Dog() {}

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "(name= " + name + ", age=" + age + ")";
    }

    @Override
    public void speak() {
        System.out.println(name + " says hello");
    }
}
