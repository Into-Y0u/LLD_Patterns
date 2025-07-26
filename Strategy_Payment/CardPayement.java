package Strategy_Payment;

public class CardPayement implements PaymentGateway {

    private long cardId;

    public CardPayement(long cardId) {
        this.cardId = cardId;
    }

    @Override
    public void pay(long ammount) {
        System.out.println("[CardNumber] " + this.cardId + " : Paid ammount > " + ammount);
    }

}