package paymentprocessingsystem;

public class PaymentSystem {

    public static void main(String[] args) {

        Payment credit = new CreditCard();
        double creditPay = credit .processPayment(7899);
        System.out.println("Credit Card Amount is: " + creditPay);

        Payment upi = new UPI();
        double upiPay = upi.processPayment(6789);
        System.out.println("UPI Amount is: " + upiPay);
    }
}