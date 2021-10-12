package design_patterns.adapter;

public interface Bird {

    default void fly(){
        System.out.println("flying...");
    };
    void makeSound();

}
