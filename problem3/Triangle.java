package problem3;

public class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        super("Triangle");
        if(side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.out.println("Invalid triangle sides... Please enter valid sides that form a triangle.");
            System.exit(1);
        }
    }

    @Override
    public double getPerimeter(){
        double p = this.side1 + this.side2 + this.side3;
        return p;
    }

    @Override
    public double getArea(){
        double p = getPerimeter() / 2;
        double area = Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
        return area;
    }

    @Override
    public String toString() {
        return super.toString() + ", side1: " + String.format("%.2f", this.side1) + ", side2: " + String.format("%.2f", this.side2) + ", side3: " + String.format("%.2f", this.side3);
    }
}
