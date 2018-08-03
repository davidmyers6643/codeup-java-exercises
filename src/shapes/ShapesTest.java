package shapes;

import java.util.HashMap;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());


        Measurable myRectangle = new Rectangle(5, 8);
        System.out.println(myRectangle.getArea());
        System.out.println(myRectangle.getPerimeter());




//        System.out.println("Rectangle...");
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//        System.out.println();
//
//        System.out.println("util.Square1...");
//        util.Square1 box2 = new util.Square1(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
//        System.out.println();
//
    }
}
