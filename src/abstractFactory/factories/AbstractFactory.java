package abstractFactory.factories;

import abstractFactory.shapes.Shape;

public abstract class AbstractFactory {

    public abstract Shape getShape (String type);
}
