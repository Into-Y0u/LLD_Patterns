package Strategy_Payment;

public interface PaymentGateway {

    public abstract void pay(long amount);

    public static void test() {
        System.out.println("Worksasd");
    }

}
