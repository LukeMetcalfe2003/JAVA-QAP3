package problem4;

public abstract class Shape implements Scalable {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    // get perimeter
    public abstract double getPerimeter();

    // get area
    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape: " + name + ", perimeter: " + String.format("%.2f", getPerimeter()) + ", area: " + String.format("%.2f", getArea());
    }

}

