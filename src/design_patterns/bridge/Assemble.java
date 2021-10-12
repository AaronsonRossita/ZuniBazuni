package design_patterns.bridge;

public class Assemble implements Workshop {
    @Override
    public void work() {
        System.out.println("was assembled ");
    }
}
