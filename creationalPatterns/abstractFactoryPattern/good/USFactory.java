public class USFactory {
    PaymentGateway createPaymentGateway(String gatewayType) {
        if(gatewayType.equalsIgnoreCase("Stripe"))
            return new Stripe();
        else if(gatewayType.equalsIgnoreCase("Square"))
            return new Square();
        else throw new IllegalArgumentException("Payment gateway of type "+gatewayType+" is not supported.");
    }

    Invoice createInvoice() {
        return new USInvoice();
    }
}
