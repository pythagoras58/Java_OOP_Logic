
package ExerciseOne;

import java.util.Scanner;

/**
 *
 * @author Danso Solomon Danquah (Zhìhuì)
 */
public class LinearEquationTest {
    public static void main(String[] args) {
        //Use the scanner class : create an instance of it
        Scanner scanner = new Scanner(System.in);
        //local variables
        double a,b,c,d,e,f;
        
        System.out.println("Enter Values for a,b,c,d,e, and f");
        System.out.println("Enter Value For A: ");
        a = scanner.nextDouble();
        System.out.println("Enter Value For B: ");
        b = scanner.nextDouble();
        System.out.println("Enter Value For C: ");
        c = scanner.nextDouble();
        System.out.println("Enter Value For D: ");
        d = scanner.nextDouble();
        System.out.println("Enter Value For E: ");
        e = scanner.nextDouble();
        System.out.println("Enter Value For F: ");
        f = scanner.nextDouble();
        
        //instantiate the Linear Equation Class
        LinearEquations linearEquations = new LinearEquations(a, b, c, d, e, f);
        
        //Print results - If ad - bc is 0, report that “The equation has no solution.”
        if(linearEquations.isSolvable()){
            System.out.println("X is " + linearEquations.getX());
            System.out.println("Y is " + linearEquations.getY());
        }else{
            System.out.println("The equation has no solution");
        }
        
    }
            
}
