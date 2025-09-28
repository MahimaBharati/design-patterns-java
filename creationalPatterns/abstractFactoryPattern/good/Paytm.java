public class Paytm implements PaymentGateway{
    public void processPayment(double amount) {
        System.out.println("Processing payment of "+amount+" rupees through Paytm.");
    }
}
