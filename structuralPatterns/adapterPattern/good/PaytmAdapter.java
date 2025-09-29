public class PaytmAdapter implements PaymentGateway{
    Paytm gateway;
    PaytmAdapter(Paytm paytmGateway) {
        this.gateway=paytmGateway;
    }
    public void pay(double amount) {
        this.gateway.makePayment(amount);
    }
    
}
