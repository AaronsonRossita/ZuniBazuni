package abstractFactory;


import abstractFactory.factories.AbstractFactory;
import abstractFactory.factories.FactoryProducer;
import abstractFactory.shapes.Shape;

public class RunnerAbstractFactory {

    public static void main(String[] args) {

        AbstractFactory factory = FactoryProducer.getFactory(false);
        Shape s1 = factory.getShape("rectangle");
        s1.draw();

    }

}
