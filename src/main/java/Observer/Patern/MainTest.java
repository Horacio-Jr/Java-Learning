package Observer.Patern;

public class MainTest {
    public static void main(String [] args) throws InterruptedException, Exception {
        BarGraphic barGraphic = new BarGraphic();
        StockPortfolioLogger logger = new StockPortfolioLogger();
        StockPortfolio stockPortfolio = new StockPortfolio();

        stockPortfolio.addObserver(barGraphic);
        stockPortfolio.addObserver(logger);

        Thread.sleep(2000);
        stockPortfolio.addStock("COMP02", 200);
        Thread.sleep(2000);
        stockPortfolio.addStock("EMP34", 400);
        Thread.sleep(2000);
        stockPortfolio.addStock("ACDF89", 300);
        Thread.sleep(2000);
        stockPortfolio.addStock("EMP34", -200);
        Thread.sleep(2000);
        stockPortfolio.addStock("COMP02", 150);

    }
}
