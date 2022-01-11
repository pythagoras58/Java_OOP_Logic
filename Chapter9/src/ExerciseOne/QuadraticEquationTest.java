
package ExerciseOne;

import java.util.Scanner;

/**
 *
 * @author Pythagoras
 */
public class QuadraticEquationTest {
    public static void main(String[] args) {
        // Institate the scanner class
        Scanner scanner = new Scanner(System.in);
        //create local variables a,b, and c
        double a,b,c;
        //Accept the values of a ,b and c
        System.out.println("Enter the values of A, B and C");
        System.out.println("=============================");
        System.out.println("Enter Value of A: ");
        a = scanner.nextDouble();
        System.out.println("Enter Value of B: ");
        b = scanner.nextDouble();
        System.out.println("Enter Value of C: ");
        c = scanner.nextDouble();
        
        // instantiate the quadraticEquation class
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        
        if(quadraticEquation.getDiscriminant() > 0){
            System.out.println("The 2 Roots Are: " + quadraticEquation.getRoot1()
                + " and " + quadraticEquation.getRoot2());
        }
        else if(quadraticEquation.getDiscriminant() == 0){
            if(quadraticEquation.getRoot1() > 0){
                System.out.println("The Equation Has One Root: " + quadraticEquation.getRoot1());
            }else{
                System.out.println("The Equation Has One Root: " + quadraticEquation.getRoot2());
            }  
        }
        else{
            System.out.println("The Equation Has No Root");
        }
    }
}
