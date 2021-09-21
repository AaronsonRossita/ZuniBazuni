package nestedClass;

public class Circle {

    private int radius;
    private Point center;

    public Circle(int radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public Circle (int radius, int pointX, int pointY){
        this.radius = radius;
        this.center = new Point(pointX, pointY);
    }



    public class Point{

        private int x,y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
