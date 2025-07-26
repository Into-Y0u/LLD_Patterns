package Observer_StockAlertSystem;

import java.util.HashSet;

public class Stock implements Subject {

    private String stockName;
    private float stockPrice;
    private HashSet<Observer> observerList = null;

    public Stock(String stockName, float stockPrice) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        observerList = new HashSet<Observer>();
    }

    public String getStockName() {
        return stockName;
    }

    public float getStockPrice() {
        return stockPrice;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public void setStockPrice(float stockPrice) {
        if (this.stockPrice != stockPrice) {
            this.stockPrice = stockPrice;
            notifyAllObserver();
        }
    }

    @Override
    public void register(Observer obs) {
        observerList.add(obs);
    }

    @Override
    public void unregister(Observer obs) {
        observerList.remove(obs);
    }

    @Override
    public void notifyAllObserver() {
        for (Observer obs : observerList) {
            obs.update(this.stockName, this.stockPrice);
        }
    }
}
