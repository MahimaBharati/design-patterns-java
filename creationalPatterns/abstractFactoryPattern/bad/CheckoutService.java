public class CheckoutService {
    String gatewayType;
    PaymentGateway paymentGateway;
    Invoice invoice;
    public CheckoutService(String gatewayType) {
        if(gatewayType.equalsIgnoreCase("Paytm")) {
            this.paymentGateway= new Paytm();
        } else if(gatewayType.equalsIgnoreCase("PhonePe")) {
            this.paymentGateway=new PhonePe();
        } else {
            throw new IllegalArgumentException("Payment gateway of type "+gatewayType+" is not supported yet!");
        }
        this.invoice = new IndiaInvoice();
    }

    public void checkout(double amount) {
        this.paymentGateway.processPayment(amount);
        this.invoice.generateInvoice();
    }
}
