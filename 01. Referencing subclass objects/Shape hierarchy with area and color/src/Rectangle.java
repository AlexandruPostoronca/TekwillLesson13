public class Rectangle extends Shape {

// add fields and consturctor
    protected double x;
    protected double y;

    public Rectangle(double x, double y, String color) {
        super(color);
        this.x = x;
        this.y = y;
    }

    // Override getArea method

    @Override
    public double getArea() {
        return x*y;
    }
}