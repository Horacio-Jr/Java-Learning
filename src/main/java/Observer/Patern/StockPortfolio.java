package Observer.Patern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockPortfolio {

    private final Map<String, Integer> stocks = new HashMap<>();
    private final List<Observer> observers = new ArrayList<>();

    public void addStock(String stock, Integer quantity) {
        if (stocks.containsKey(stock)) {
            quantity += stocks.get(stock);
        }
        stocks.put(stock, quantity);
        notifyOthers(stock, quantity);
    }

    private void notifyOthers(String stock, Integer quantity) {
        for (Observer observer : observers) {
            observer.quantityChange(stock, quantity);
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }
}
