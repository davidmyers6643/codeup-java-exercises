import util.Input;

public class Rectangle {
    protected int length;
    protected int width;
    public int perimeter;
    public int area;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getPerimeter() {
       return perimeter = 2 * length + 2 * width;
    }

    public int getArea() {
        return area = length * width;

    }




}
