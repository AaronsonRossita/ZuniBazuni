package design_patterns.factory;

public class Square implements Shape {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }


    @Override
    public void draw() {
        System.out.println("□");
    }

    @Override
    public void getPerimeter() {
        System.out.println(4 * side);
    }

    @Override
    public void whatClass() {
        System.out.println("I'm a Square");
    }
}
