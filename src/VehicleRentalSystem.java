 class Vehicle {
    String  vechicleno ;
    double rateperday;

    public double calculateInterest(int days) {
        return 0;
    }
    }

    class car extends Vehicle {
        car(){
            rateperday = 1000;
        }
        public double calculateInterest(int days){
            return  days * rateperday;

        }
    }

    class bike extends Vehicle {
        bike(){
            rateperday = 500;
        }

        @Override
        public double calculateInterest(int days) {
            return days * rateperday;

        }
    }



public class VehicleRentalSystem {

    public static void main (String [] args){

        Vehicle v = new car ();
        double carrent = v.calculateInterest(4);
        System.out.println("Car Rental Charger: " + carrent);

        v = new bike ();
       double bikerent = v.calculateInterest(7);
       System.out.println(" Bike Rental Charger: " + bikerent);
    }

}
