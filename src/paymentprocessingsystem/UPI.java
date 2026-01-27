package paymentprocessingsystem;

public class UPI implements Payment {

    @Override
    public double processPayment(double amount) {
        return amount;
    }
}
