public class Stripe implements PaymentGateway{
    public void processPayment(double amount) {
        System.out.println("Processing payment of "+amount+" USD through Stripe.");
    }
    
}
