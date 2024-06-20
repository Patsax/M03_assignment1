package javaDevelop.M03.M03_assignment1;

public class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10.0);
        Circle circle2 = new Circle(5.0);
        Circle largerCircle;
        
        
        System.out.println("Two Circles circle1 and circle2 with radius 10.0 and 5.0 respectively");
        largerCircle = Circle.findLarger(circle1, circle2);
        System.out.println("The larger among the two circle is the one with radius : " + largerCircle.getRadius());
    }
}
