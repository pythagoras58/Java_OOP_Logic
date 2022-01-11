
package Question1;

/**
 *
 * @author Danso Solomon Danquah :: Zhihui
 */
public class Traingle extends GeometricObject{
    
    private double side1, side2, side3;
    
    // Initialize the values of the placeholders in a constructor

    public Traingle() {
        side1 = side2 = side3 = 1.0;
    }
    
    //A constructor that creates a triangle with the specified side1 , side2 , and side3 .

    public Traingle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    
    // accessor methods for all the  placeholders

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    
    // A method named getArea() that returns the area of this triangle.
    public double getArea(){
        // Programming Exercise 2.19 - from the testbook
        double area, totalArea;
        area = (side1 + side2 + side3) / 2;
        totalArea = Math.sqrt( area * (area - side1) * (area - side2) * (area - side3));
        return totalArea;
    }
    
    // A method named getPerimeter() that returns the perimeter of this triangle.
    public double getPerimeter(){
        double perimeter = side1 + side2 + side3;
        return perimeter;
    }
    
    // A method named toString() that returns a string description for the triangle.
    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +" side3 = " + side3;
    }
    
}
