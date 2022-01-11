
package Question1;

import java.util.Scanner;

/**
 *
 * @author Danso Solomon Danquah :: Zhihui
 */
public class TestTriangle {

    public static void main(String[] args) {
        // Create a scanner object to get some data
        Scanner scanner = new Scanner(System.in);

        // accept values for all 3 sides from user
        System.out.println("===========================");
        System.out.println("Enter All 3 Sides: ");
        System.out.println("===========================");
        System.out.println("Enter Side 1 value: ");
        double side1 = scanner.nextDouble();
        System.out.println("Enter Side 2 value: ");
        double side2 = scanner.nextDouble();
        System.out.println("Enter Side 3 value: ");
        double side3 = scanner.nextDouble();

        // accept a color
        System.out.print("Enter a color: ");
        String color = scanner.next();

        // accept isFilled value for the triangle 
        System.out.print("Is the triangle filled (true / false)? ");
        boolean filled = scanner.nextBoolean();

        // instantiate the Triangle class
        Traingle traingle = new Traingle(side1, side2, side3);
        traingle.setColor(color);
        traingle.setFilled(filled);

        // Print Outs
        System.out.println(traingle.toString());
        System.out.println("Area: " + traingle.getArea());
        System.out.println("Perimeter: " + traingle.getPerimeter());
        System.out.println("Color: " + traingle.getColor());
        System.out.println("Triangle is" + (traingle.isFilled() ? "" : " not ")
                + "filled");
    }
}
