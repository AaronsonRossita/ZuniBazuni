package abstractFactory.shapes.slanted;

import abstractFactory.shapes.Shape;

public class Parallelogram implements Shape {

    private String name;

    public Parallelogram(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "I'm a parallelogram and my name is " + name;
    }

    @Override
    public void draw() {
        System.out.println("▱");
    }
}
