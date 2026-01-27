package vehiclerentalsystem;

public class Bike extends Vehicle {

    public Bike() {
        ratePerDay = 500;
    }

    @Override
    public double calculateRent(int days) {
        return days * ratePerDay;
    }
}
