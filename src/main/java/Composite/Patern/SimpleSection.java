package Composite.Patern;

public class SimpleSection implements AirSection {

    private final String origin;
    private final String destiny;
    private final double price;

    public SimpleSection(String origin, String destiny, double price) {
        this.origin = origin;
        this.destiny = destiny;
        this.price = price;
    }

    @Override
    public String getOrigin() {
        return origin;
    }

    @Override
    public String getDestiny() {
        return destiny;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "SimpleSection{" +
                "origin='" + origin + '\'' +
                ", destiny='" + destiny + '\'' +
                ", price=" + price +
                '}';
    }
}
