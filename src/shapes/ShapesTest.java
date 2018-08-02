package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        System.out.println("Rectangle...");
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());
        System.out.println();

        System.out.println("Square...");
        Square box2 = new Square(5);
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());
        System.out.println();

    }
}
