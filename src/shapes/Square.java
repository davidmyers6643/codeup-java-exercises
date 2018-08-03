package shapes;

public class Square extends Rectangle implements Measurable{

    public Square(double length) {
        super(length, length);
    }

    @Override
    void setLength(double length) {
        this.length = this.width = length;

    }
    @Override
    void setWidth(double width) {
        this.length =this.width = width;

        }

        @Override
    public double getPerimeter() {
         return (this.length * 2) + (this.width * 2)  ;
        }

        @Override
    public double getArea() {
        return length * width;
        }
//
//    public util.Square1(double side){
//        super(side, side);
//    }
//
//    @Override
//    public double getArea() {
//        return length * length;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 4 * length;
//    }





}
