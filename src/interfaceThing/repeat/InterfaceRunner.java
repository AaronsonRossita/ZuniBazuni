package interfaceThing.repeat;

public class InterfaceRunner {

    public static void main(String[] args) {

        Shape s1 = new Circle();
        Shape s2 = new Square();
//        Shape s3 = new Point();

        Circle c1 = new Circle();

        s1.draw();
//        s1.getArea();
        c1.doubleCircle();

//        process(s1);
//        process(s2);
//        process(c1);
        doSmthngCircle(s2);
    }

    public static void process (Shape s){
//        System.out.println(s.getArea());
        System.out.println(s.draw());
    }

    public static void doSmthngCircle (Shape s){
        if (s.getClass() == Circle.class){
            Circle c = (Circle) s;
            System.out.println(c);
        }else{
            System.out.println("not a circle");
        }


    }


}
