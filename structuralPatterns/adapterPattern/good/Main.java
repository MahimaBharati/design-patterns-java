public class Main {
    public static void main(String[] args) {
        PaymentGateway phonepe=new PhonePe();
        CheckoutService phonepeCheckout = new CheckoutService(phonepe);
        phonepeCheckout.checkout(1000);
        PaymentGateway paytm=new PaytmAdapter(new Paytm());
        CheckoutService paytmCheckout = new CheckoutService(paytm);
        paytmCheckout.checkout(10000);
    }
}
