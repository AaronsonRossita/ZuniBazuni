package abstractFactory.shapes.regular;

import abstractFactory.shapes.Shape;

public class Rectangle implements Shape {

    private String name;

    public Rectangle(String name) {
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
        return "I'm a rectangle and my name is " + name;
    }

    @Override
    public void draw() {
        System.out.println("▭");
    }
}
