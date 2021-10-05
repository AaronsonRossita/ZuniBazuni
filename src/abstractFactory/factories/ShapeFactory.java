package abstractFactory.factories;

import abstractFactory.shapes.regular.Rectangle;
import abstractFactory.shapes.Shape;
import abstractFactory.shapes.regular.Square;

public class ShapeFactory extends AbstractFactory
 {

    public Shape getNotSlantedShape(String type){
        if(type.toLowerCase().equals("Square")){
            return new Square("Pretty Square");
        }else{
            return new Rectangle("Cheesy Rectangle");
        }
    }


     @Override
     public Shape getShape(String type) {
         return getNotSlantedShape(type);
     }
 }
