package gr.aueb.cf.ch19.lifo;

public class Main {

    public static void main(String[] args) {
        IStorage<String> storage = new StorageImpl<>(50);
        IGarage garage = new GarageImpl(storage);


        try {
            garage.addCar("IZZ9801");
            System.out.println("Successfully added car");

            garage.addCar("RZZ7654");
            System.out.println("Successfully added car");

            String removeCar = garage.removeCar();
            System.out.println("Successfully removed the car: " + removeCar);

            garage.printCars();

        } catch (GarageIsFullException e) {
            System.out.println("Garage is Full");
        } catch (GarageIsEmptyException e) {
            System.out.println("Garage is Empty");
        }
    }
}
