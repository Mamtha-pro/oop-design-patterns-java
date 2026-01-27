package paymentprocessingsystem;

public class CreditCard implements Payment {

    @Override
    public double processPayment(double amount) {
        double interest = amount * 0.02;
        return amount + interest;
    }
}