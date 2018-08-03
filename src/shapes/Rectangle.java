package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
//    calls the super class instructor

        super(length, width);
    }
        @Override
        void setLength ( double length){
            this.length = length;

        }

        @Override
        void setWidth ( double width){
            this.width = width;

        }

//    protected double length;
//    protected double width;
//
//    public Rectangle(){
//
//    }
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea() {
//        return (length * width);
//    }
//
//    public double getPerimeter() {
//        return (length + width) * 2;
//    }
    }
