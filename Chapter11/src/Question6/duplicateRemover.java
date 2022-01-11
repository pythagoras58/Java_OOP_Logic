package Question6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Danso Solomon Danquah :: Zhihui
 */
public class duplicateRemover {

    // Test
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Create an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        // Prompt ther user to enter 10 integers
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            arrayList.add(input.nextInt());
        }

        // Invoke removeDuplicate method
        removeDuplicate(arrayList);

        // Display the distinct integers
        System.out.print("The distinct integers are ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
    }

    // Remove Duplicate controller
    public static void removeDuplicate(ArrayList<Integer> list) {
        // Get the size
        for (int i = 0; i < list.size() - 1; i++) {
            // check through all the array list
            for (int j = i + 1; j < list.size(); j++) {
                // remove the duplicate in the list
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                }
            }
        }
    }
}
