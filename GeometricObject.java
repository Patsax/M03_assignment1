package javaDevelop.M03.M03_assignment1;

public abstract class GeometricObject<E> implements Comparable<E> {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with the specified color
    * and filled value */
    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Return color */
    public String getColor() {
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Return filled. Since filled is boolean,
    its get method is named isFilled */
    public boolean isFilled() {
        return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** Return a string representation of this object */
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    /** Abstract compareTo method of Comparable interface */
    @Override
    public abstract int compareTo(E o);

    /** Abstract Method to get the Area of the Geometric Object */
    public abstract double getArea();

    /** Static Method to find the Larger among two Same Kind of Geometric Object*/
    public static <T extends GeometricObject> T findLarger(T obj1, T obj2){
        if(obj1.getArea() > obj2.getArea()){
            return obj1;
        }
        else if(obj1.getArea() == obj2.getArea()){
            return null; // Return null if both the objects are of same size
        }
        else{
            return obj2;
        }
    }
}
