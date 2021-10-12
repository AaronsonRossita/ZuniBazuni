package design_patterns.bridge;

public class BridgeRunner {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Car(new Assemble(), new Produce());
        vehicle1.manufacture();

        System.out.println();

        Vehicle vehicle2 = new Bike(new Assemble(), new Produce());
        vehicle2.manufacture();

    }

}
