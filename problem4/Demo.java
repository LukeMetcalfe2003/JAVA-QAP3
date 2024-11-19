package problem4;

public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(3),
            new Ellipse(5, 3),
            new Triangle(2, 3, 4),
            new EquilateralTriangle(7)
        };

        System.out.println("Before scaling: ");

        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        for (Shape shape : shapes) {
            shape.scale(2);
        } 

        System.out.println("After scaling: ");

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}