public class CheckoutService {
    PaymentGateway paymentGateway;
    Invoice invoice;
    
    public CheckoutService(String gatewayType,RegionFactory factory) {
        this.paymentGateway=factory.createPaymentGateway(gatewayType);
        this.invoice=factory.createInvoice();
    }
    public void completeOrder(double amount) {
        this.paymentGateway.processPayment(amount);
        this.invoice.generateInvoice();
    }
}
