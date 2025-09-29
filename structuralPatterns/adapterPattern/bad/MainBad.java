public class MainBad {
    public static void main(String[] args){
        PaymentGateway gateway=new PhonePe();
        gateway.pay(1000);
    }
}
