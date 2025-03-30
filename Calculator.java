public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        if (floor == null || carpet == null) {
            throw new IllegalArgumentException("Floor and Carpet cannot be null.");
        }
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }

    @Override
    public String toString() {
        return String.format("Calculator [Total Cost: $%.2f]", getTotalCost());
    }

    // == Main Method for Testing ==
    public static void main(String[] args) {
        // Creating Floor and Carpet objects
        Floor floor1 = new Floor(5.5, 4.0);
        Carpet carpet1 = new Carpet(10.0);

        // Creating Calculator
        Calculator calculator = new Calculator(floor1, carpet1);
        
        // Displaying the details
        System.out.println(floor1);
        System.out.println(carpet1);
        System.out.println(calculator);

        // Testing with negative values
        Floor invalidFloor = new Floor(-3, -4);
        Carpet invalidCarpet = new Carpet(-15);

        Calculator invalidCalc = new Calculator(invalidFloor, invalidCarpet);
        System.out.println("\nInvalid Inputs:");
        System.out.println(invalidFloor);
        System.out.println(invalidCarpet);
        System.out.println(invalidCalc);
    }
}
