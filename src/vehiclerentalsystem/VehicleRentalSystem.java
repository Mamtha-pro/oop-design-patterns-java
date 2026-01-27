package vehiclerentalsystem;

public class VehicleRentalSystem {

    public static void main(String[] args) {

        Vehicle car = new Car();
        System.out.println("Car Rental Charge: " + car.calculateRent(4));

        Vehicle bike = new Bike();
        System.out.println("Bike Rental Charge: " + bike.calculateRent(7));
    }
}

