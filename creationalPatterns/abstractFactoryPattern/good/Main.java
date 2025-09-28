public class Main {
    public static void main(String[] args) {
        CheckoutService indiaCheckout = new CheckoutService("Paytm",new IndiaFactory());
        indiaCheckout.completeOrder(1000);
    }
}
