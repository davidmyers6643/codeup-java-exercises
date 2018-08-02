package shapes;
import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Input input = new Input();

        System.out.println("Please enter radius.");
        double userinput = input.getDouble();
        System.out.println("user input: " + userinput);

        Circle circle = new Circle(userinput);

        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());


    }
}
