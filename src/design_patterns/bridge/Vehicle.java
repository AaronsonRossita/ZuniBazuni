package design_patterns.bridge;

abstract class Vehicle {

    Workshop workshop1;
    Workshop workshop2;

    protected Vehicle(Workshop workshop1, Workshop workshop2) {
        this.workshop1 = workshop1;
        this.workshop2 = workshop2;
    }

    abstract void manufacture();
}
