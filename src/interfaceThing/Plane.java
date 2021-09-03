package interfaceThing;

interface Flyable{

    void fly();

}

interface Fuelable{

    void fuelUp();

    default void payForFuel(){
        System.out.println("take my money");
    }

}

public class Plane extends Vehicle implements Flyable, Fuelable {

    public Plane(int pax) {
        super(pax);
    }

    @Override
    public void fly() {

    }

    @Override
    public void fuelUp() {

    }

    @Override
    public void payForFuel() {
        System.out.println("not paying bye");
    }
}
