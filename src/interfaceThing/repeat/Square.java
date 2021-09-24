package interfaceThing.repeat;

public class Square implements Shape, Comparable{

    private Point center;
    private int length;

    public Square(){

    }

    public Square(Point center, int length) {
        this.center = center;
        this.length = length;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int draw() {
        System.out.println("the lenght is " + this.length);
        return 0;
    }

    @Override
    public int getArea() {
        return 0;
    }

    @Override
    public boolean compare(Comparable c1, Comparable c2) {
        return false;
    }
}
