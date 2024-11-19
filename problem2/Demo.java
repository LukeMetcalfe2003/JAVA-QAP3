package problem2;

public class Demo {
    public static void main(String[] args) {
        Point p1 = new Point(1.4f, 2.5f);
        System.out.println("Point: " + p1);
        MoveablePoint mP1 = new MoveablePoint(3.4f, 4.5f, 1.0f, 2.0f);
        System.out.println("Moveable Point: " + mP1);
        mP1.move();
        System.out.println("Moveable Point after move: " + mP1);
    }
}
