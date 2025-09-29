public class PhonePe implements PaymentGateway{
    public void pay(double amount){
        System.out.println("Processing a payment of rupees "+amount+" through Phonepe");
    }
}
