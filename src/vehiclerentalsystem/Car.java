package vehiclerentalsystem;

public class Car extends Vehicle {

    public Car() {
        ratePerDay = 1000;
    }

    @Override
    public double calculateRent(int days) {
        return days * ratePerDay;
    }
}
