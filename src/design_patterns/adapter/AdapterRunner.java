package design_patterns.adapter;

public class AdapterRunner {

    public static void main(String[] args) {

        Crow crow = new Crow();
        System.out.println("Crow...");
        crow.fly();
        crow.makeSound();
        System.out.println();

        Sparrow sparrow = new Sparrow();
        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();
        System.out.println();

        PlasticToyDuck toyDuck = new PlasticToyDuck();
        System.out.println("Toy duck...");
        toyDuck.squeak();
        System.out.println();

        ToyDuck birdAdapter = new BirdAdapter(sparrow);
        System.out.println("Bird Adapter...");
        birdAdapter.squeak();

    }

}
