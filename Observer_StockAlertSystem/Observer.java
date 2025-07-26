package Observer_StockAlertSystem;

public interface Observer {
    abstract void update(String stockName, float stockPrice);
}
