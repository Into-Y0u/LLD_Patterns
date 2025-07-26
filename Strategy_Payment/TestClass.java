package Strategy_Payment;

public class TestClass {

    public static void main(String[] args) {
        try {
            System.out.println("Entry Point");

            PaypalPayment paypal = new PaypalPayment("test@testmail.com");

            PayamentManager paymentMgr = new PayamentManager();
            paymentMgr.setPaymentGateWay(paypal);
            paymentMgr.checkout(3200);

        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("[EXCETION AT MAIN]" + e);
        }

    }
}