package Observer.Patern;

public class StockPortfolioLogger implements Observer {
    @Override
    public void quantityChange(String stock, Integer quantity) {
        System.out.println("Alterada a quantidade da ação " + stock + " para " + quantity);
    }
}
