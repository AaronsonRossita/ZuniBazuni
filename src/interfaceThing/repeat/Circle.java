package interfaceThing.repeat;

public class Circle implements Shape, Comparable{

    private Point center;
    private int radius;

    public Circle(){

    }

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void doubleCircle(){

    }

    @Override
    public int draw() {
        System.out.println("radius is " + this.radius);
        return 0;
    }

    @Override
    public int getArea() {
        return 0;
    }

    @Override
    public boolean compare(Comparable c1, Comparable c2) {

        return (c1.getArea() > c2.getArea()) ? true : false;
    }
}
