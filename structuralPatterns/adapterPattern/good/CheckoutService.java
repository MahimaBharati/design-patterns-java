public class CheckoutService {
    PaymentGateway gateway;
    CheckoutService(PaymentGateway gateway) {
        this.gateway=gateway;
    }
    public void checkout(double amount) {
        this.gateway.pay(amount);
    }
}
