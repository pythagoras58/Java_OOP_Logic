package Question5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Danso Solomon Danquah :: Zhihui
 */
public class LargestRowCol {

    // Test
    public static void main(String[] args) {
// Create a Scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the array size n
        System.out.print("Enter the array size n: ");
        int n = scanner.nextInt();

        // Create a n-by-n matrix
        int[][] array = new int[n][n];

        // Invoke fill method
        input(array);

        // Display random array
        display(array);

        // Diplay the rows and columns with the most 1s
        System.out.print("The largest row index: ");
        display(largestRow(array));
        System.out.print("The largest column index: ");
        display(largestColumn(array));
    }

    // get the integers in the array list
    public static void display(ArrayList<Integer> num) {
        for (int i = 0; i < num.size(); i++) {
            System.out.print(num.get(i) + "");
        }
        System.out.println("");
    }

    //Return a list of the column indices with the most 1
    public static ArrayList<Integer> largestColumn(int[][] array) {
        ArrayList<Integer> index = new ArrayList<Integer>();
        int[] count = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 1) {
                    count[j]++;
                }
            }
        }
        int max = max(count);
        getIndex(index, count, max);
        return index;
    }

    //Return a list of the row indices with the most 1
    public static ArrayList<Integer> largestRow(int[][] array) {
        ArrayList<Integer> index = new ArrayList<Integer>();
        int[] count = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[j][i] == 1) {
                    count[j]++;
                }
            }
        }
        int max = max(count);
        getIndex(index, count, max);
        return index;
    }

    //Return the maximum integer in the array
    public static int max(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    // Adds the indices of x in count to the list
    public static void getIndex(ArrayList<Integer> list, int[] count, int x) {
        for (int i = 0; i < count.length; i++) {
            if (count[i] == x) {
                list.add(i);
            }
        }
    }

    // Fill array randomly with 0s and 1s
    public static void input(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 2);
            }
        }
    }

    //Display matrix
    public static void display(int[][] array) {
        System.out.println("The random array is");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
