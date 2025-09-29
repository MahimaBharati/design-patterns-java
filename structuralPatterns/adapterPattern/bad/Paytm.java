public class Paytm {
    //Paytm doesn't implement PaymentGateway interface because of its API contract
    public void makePayment(double amount) {
        System.out.println("Making a payment of rupees "+amount+" through Paytm");
    }
}
