package Composite.Patern;

public class ComposedSection implements AirSection {

    private AirSection first;
    private AirSection second;
    private double rateOfConnection;

    public ComposedSection(AirSection first, AirSection second, double rateOfConnection) {
        this.first = first;
        this.second = second;
        this.rateOfConnection = rateOfConnection;
        if (first.getDestiny() != second.getOrigin()) {
            throw new RuntimeException("The destiny and origin is different");
        }
    }

    @Override
    public String getOrigin() {
        return first.getOrigin();
    }

    @Override
    public String getDestiny() {
        return second.getDestiny();
    }

    @Override
    public double getPrice() {
        return first.getPrice() + second.getPrice() + rateOfConnection;
    }

    @Override
    public String toString() {
        return "ComposedSection{" +
                "first=" + first +
                ", second=" + second +
                ", rateOfConnection=" + rateOfConnection +
                '}';
    }
}
