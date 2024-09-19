package gr.aueb.cf.ch17.prct.clonedemo;

public class Main {

    public static void main(String[] args) {

        Trainee alice = new Trainee("Alice", new City("Athens"));
        Trainee alice2 = new Trainee(alice);

        alice2.getCity().setDescription("New York");

        System.out.println(alice);
        System.out.println(alice2);
    }
}
