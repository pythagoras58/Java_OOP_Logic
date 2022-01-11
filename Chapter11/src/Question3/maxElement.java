
package Question3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Danso Solomon Danquah :: Zhihui
 */
public class maxElement {

    // Test Program
    public static void main(String[] args) {
        // Scanner class for user inputs
        Scanner scanner = new Scanner(System.in);

        // ArrayList 
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        // User Input
        System.out.println(" enter a sequence of numbers ending with 0");
        Integer userValue = scanner.nextInt();

        // let program run while user value is not 0 and return the max value
        while (userValue.intValue() != 0) {
            arrayList.add(userValue);
            userValue = scanner.nextInt();
        }

        // Display the largest number in the input 
        System.out.println("The largest number in the input is " + max(arrayList));
    }

    public static Integer max(ArrayList<Integer> list) {
        Integer maxListValue = list.get(0);
        // return null if list is 0 or null
        if (list.size() == 0) {
            return null;

        }

        //maximum value in an ArrayList of integers
        for (int i = 0; i < list.size(); i++) {
            // get the maximum value
            if (list.get(i) > maxListValue) {
                maxListValue = list.get(i);
            }
        }

        return maxListValue;
    }
}
