package abstractFactory.factories;

import abstractFactory.shapes.slanted.Diamond;
import abstractFactory.shapes.slanted.Parallelogram;
import abstractFactory.shapes.Shape;

public class SlantedShapeFactory extends AbstractFactory {

    public Shape getSlantedShape(String type){
        if (type.toLowerCase().equals("square")){
            return new Diamond("Pretty Diamond");
        }else{
            return new Parallelogram("Cheesy Parallelogram");
        }
    }

    @Override
    public Shape getShape(String type) {
        return getSlantedShape(type);
    }
}
