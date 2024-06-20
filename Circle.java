package javaDevelop.M03.M03_assignment1;

public class Circle extends GeometricObject<Circle> {
    private double radius;
    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Return area */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return diameter */
    public double getDiameter() {
        return 2.0 * radius;
    }

    /** Return perimeter */
    public Double getPerimeter() {
        return 2.0 * radius * Math.PI;
    }

    /* Print the circle info */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }

    @Override
    public int compareTo(Circle circle){
        if(this.radius == circle.getRadius()){
            return 0;
        }
        else if(this.radius > circle.getRadius()){
            return 1;
        }
        else{
            return -1;
        }
    }
}
