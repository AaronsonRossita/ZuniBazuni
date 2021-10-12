package design_patterns.adapter;

public class Crow implements Bird {




    @Override
    public void makeSound() {
        System.out.println("Kar kar...");
    }
}
