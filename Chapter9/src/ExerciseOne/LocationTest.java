
package ExerciseOne;

//import the scanner class
import java.util.Scanner;

/**
 *
 * @author Danso Solomon Danquah (Zhìhuì)
 */
public class LocationTest {
    public static void main(String[] args) {
        //Instance of the Scanner Class
        Scanner scanner = new Scanner(System.in);
        
        //Create Local variables for row and column data
        int row, column;
        
        System.out.println("Enter Row and Column Numbers For the Array");
        System.out.println("Enter Row Value: ");
        row = scanner.nextInt();
        System.out.println("Enter Column Value: ");
        column = scanner.nextInt();
        
        // create a matrice for n number of array dimension 
        double [][] matrice = new double[row][column];
        System.out.println("Enter Array Data: ");
        for(int i =0; i<matrice.length; i++){
            for(int j=0; j<matrice[i].length; j++){
                // allow input based on user's discretion
                matrice[i][j] = scanner.nextDouble();
            }
        }
        
        //get the location of maxvalue from the locatelargest method
        Location maximalValue = locateLargest(matrice);
        
        //Display the location of the maximum value and the value itself
        System.out.println("The location of the largest element is: "
            + maximalValue.maxValue + " at (" 
                + maximalValue.row +"," + maximalValue.column + ")");
    }
    
    //returns the location of the largest element in a two-dimensional array:
    public static Location locateLargest(double[][] a){
        return new Location(a);
    }
}
