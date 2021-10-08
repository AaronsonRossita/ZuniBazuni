package design_patterns.factory;

public class FactoryRunner {

    public static void main(String[] args) {

//        Circle c = new Circle(5);
        ShapeFactory factory = new ShapeFactory();

        Shape c1 = factory.getObject("circle",5);
        c1.draw();
        c1.getPerimeter();
        c1.whatClass();

        Shape s1 = factory.getObject("square",5);
        s1.draw();
        s1.getPerimeter();
        s1.whatClass();



        try{
            Shape n1 = factory.getObject("triangle",3);
            n1.draw();
        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }

        System.out.println("i" +
                "I'm still working");

    }

}
