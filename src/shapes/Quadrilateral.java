package shapes;

public abstract class Quadrilateral extends Shape  implements Measurable {

    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }
//    since we dont know what kind od quad it is
//    the process its defined in each class.
    abstract void setLength(double length);
    abstract void setWidth(double width);


    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
