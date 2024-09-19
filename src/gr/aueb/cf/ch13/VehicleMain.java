package gr.aueb.cf.ch13;

import gr.aueb.cf.ch13.model.*;

public class VehicleMain {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(1, "Fiat car", 0.0, ColorType.BLACK);

        vehicle.startEngine();
        vehicle.stopEngine();
    }
}