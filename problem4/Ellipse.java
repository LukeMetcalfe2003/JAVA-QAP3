package problem4;

public class Ellipse extends Shape{
    private double majorAxis;
    private double minorAxis;

    public Ellipse(double firstAxis, double secondAxis) {
        super("Ellipse");
        if(firstAxis >= secondAxis){
            this.majorAxis = firstAxis;
            this.minorAxis = secondAxis;
        } else {
            this.majorAxis = secondAxis;
            this.minorAxis = firstAxis;
        }
    }

    @Override
    public double getPerimeter() {
        double diff = majorAxis - minorAxis;
        if(diff == 0.0){
            return Math.PI * 2 * majorAxis;
        } else {
            return Math.PI * Math.sqrt((2*(Math.pow(majorAxis, 2) + Math.pow(minorAxis, 2))) - Math.pow(diff, 2)/2);
        }
    }

    @Override
    public double getArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    @Override
    public void scale(double factor) {
        this.majorAxis = majorAxis *= factor;
        this.minorAxis = minorAxis *= factor;
    }

    @Override
    public String toString() {
        return super.toString() + ", major axis: " + String.format("%.2f", majorAxis) + ", minor axis: " + String.format("%.2f", minorAxis);
    }
    
}
