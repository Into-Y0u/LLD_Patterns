package Strategy_Payment;

public class PayamentManager {

    PaymentGateway paymentGateway;

    public PayamentManager() {

    }

    public void setPaymentGateWay(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean checkout(long ammount) {
        this.paymentGateway.pay(ammount);
        return true;
    }

}
