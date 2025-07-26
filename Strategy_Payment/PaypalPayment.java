
package Strategy_Payment;

import java.text.MessageFormat;

public class PaypalPayment implements PaymentGateway {

    private String emailId;

    public PaypalPayment(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public void pay(long ammount) {

        try {
            System.out.println("[EmailId] " + this.emailId + " : Paid ammount > " + ammount);
        } catch (Exception e) {
            System.err.println("[Caught exception ] " + e);
        }

    }

}