package Observer_StockAlertSystem;

public interface Subject {
    abstract void register(Observer obs);

    abstract void unregister(Observer obs);

    abstract void notifyAllObserver();

}
