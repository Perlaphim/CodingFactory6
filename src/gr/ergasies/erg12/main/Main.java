package gr.ergasies.erg12.main;

import gr.ergasies.erg12.user.*;

public class Main {

    public static void main(String[] args) {

        User alice = new User(112314513, "Alice", "W.");

        UserCredentials bob = new UserCredentials(123141312, "Bob", "Feral#cat19");


        System.out.println("ID: " + alice.getId());
        System.out.println("Firstname: " + alice.getFirstname());
        System.out.println("Lastname: " + alice.getLastname());

        System.out.println("ID: " + bob.getId());
        System.out.println("Firstname: " + bob.getUsername());
        System.out.println("Password: " + bob.getPassword());
    }
}
