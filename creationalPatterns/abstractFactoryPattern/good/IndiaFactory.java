public class IndiaFactory implements RegionFactory{
    PaymentGateway gateway;
    Invoice invoice;
    public PaymentGateway createPaymentGateway(String gatewayType) {
        if(gatewayType.equalsIgnoreCase("Paytm")) return new Paytm();
        else return new PhonePe();
    }
    public Invoice createInvoice() {
        return new IndiaInvoice();
    }
}
