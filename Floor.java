public class Floor {

    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    public double getArea() {
        return width * length;
    }

    @Override
    public String toString() {
        return String.format("Floor [Width: %.2f, Length: %.2f, Area: %.2f]", 
                width, length, getArea());
    }
}
