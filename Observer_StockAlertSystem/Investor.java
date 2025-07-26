package Observer_StockAlertSystem;

public class Investor implements Observer {

    private String name;
    private int id;

    public Investor(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void update(String stockName, float stockPrice) {
        String text = String.format("Hey %s !, We have price update for Stock %s | CurPrice %f ", this.name, stockName,
                stockPrice);
        System.out.println(text);
    }

}
