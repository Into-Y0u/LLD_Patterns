package Observer_StockAlertSystem;

public class StockAlertSystem {

    public static void main(String[] args) {

        Stock appleStock = new Stock("apple", 77.0f);
        Stock googleStock = new Stock("google", 87.0f);

        Investor arghya = new Investor("Arghya", 23);
        Investor benja = new Investor("Benja", 32);

        appleStock.register(arghya);
        appleStock.register(benja);
        googleStock.register(benja);

        appleStock.setStockPrice(130f);
    }

}
