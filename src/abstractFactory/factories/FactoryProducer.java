package abstractFactory.factories;

public class FactoryProducer {

    public static AbstractFactory getFactory(boolean slanted){
        if (slanted){
            return new SlantedShapeFactory();
        }else{
            return new ShapeFactory();
        }
    }
}
