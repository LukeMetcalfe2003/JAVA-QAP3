package problem3;

public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(3),
            new Ellipse(5, 3),
            new Triangle(2, 3, 4),
            new EquilateralTriangle(7)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
