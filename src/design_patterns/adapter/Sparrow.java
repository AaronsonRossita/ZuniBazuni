package design_patterns.adapter;

public class Sparrow implements Bird {


    @Override
    public void makeSound() {
        System.out.println("chirp chirp...");
    }
}
