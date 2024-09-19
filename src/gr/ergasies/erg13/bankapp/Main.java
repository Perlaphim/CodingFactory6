package gr.ergasies.erg13.bankapp;

import gr.ergasies.erg13.bankapp.model.*;

public class Main {

    public static void main(String[] args) throws Exception {
        OverdraftAccount ba = new OverdraftAccount("142130", 124123.0);
        JointAccount h = new JointAccount("Alice", "W.", "GR1233", "Bob", "M.", "GR2353", "142130");

        double balance = ba.getBalance();
        try {
            if (ba.checkID(h.getAccountID())) {
                ba.withdraw(1231512.2);
                ba.checkBalance();
            }
        } catch (Exception e) {
            System.err.println("Wrong account ID");
        }
    }
}