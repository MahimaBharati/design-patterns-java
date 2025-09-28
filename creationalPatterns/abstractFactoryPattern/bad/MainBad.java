public class MainBad {
    public static void main(String[] args) {
        CheckoutService checkoutService=new CheckoutService("PhonePe");
        checkoutService.checkout(1000);
    }
}
