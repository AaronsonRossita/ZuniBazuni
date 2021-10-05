package factory;

public class ShapeFactory {

    public Shape getObject (String s, int x){
        switch (s.toLowerCase()){
            case Constants.CIRCLE:
                return new Circle(x);
            case Constants.SQUARE:
                return new Square(x);
            default:
                System.out.println("no class detected");
                return null;
        }
    }

}
