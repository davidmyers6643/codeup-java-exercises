package shapes;

public class Circle {

//    properites
    private double radius;
    public final double pi = 3.1415;

// constructor
    public Circle(double radius) {
        this.radius = radius;
    }

// getter & setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

// methods
    public double getArea() {
        return pi * (radius * radius);
    }

    public double getCircumference() {
        return 2 * pi * radius;
    }
}
