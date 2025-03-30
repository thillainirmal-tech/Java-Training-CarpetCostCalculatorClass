public class Carpet {

    private double cost;

    public Carpet(double cost) {
        this.cost = (cost < 0) ? 0 : cost;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return String.format("Carpet [Cost per sq. unit: $%.2f]", cost);
    }
}
