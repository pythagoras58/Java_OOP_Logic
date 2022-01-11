
package stacks;

import java.util.Scanner;

/**
 *
 * @author Danso Solomon Danquah - Zhihui
 */
public class PrimeFactors {
    
    public static void main(String[] args) {
        // Instantiate the Scanner CLass and the StackOfIntegers Class
        Scanner scan = new Scanner(System.in);
        StackOfIntegers stackOfIntegers = new StackOfIntegers();
        
        
        // accept a positive integer from the use
        System.out.println("Enter a positive integer");
        int digit = scan.nextInt();
        
        // output the factor per intruction :: in descending order using the stackofintegers
        System.out.print("The smallest factors of " + digit + " are displayed as ");
        SmallestPrimeFactor(digit, stackOfIntegers);
        
        // Clear the heap space to prevent unwanted exceptions
        while(!stackOfIntegers.empty()){
            System.out.print(stackOfIntegers.pop() + " ");
        }
        System.out.println();
    }
    
    public static void SmallestPrimeFactor(int digit, StackOfIntegers stackOfIntegers){
        // assume a prime factor
        int prime = 2;
        
        // get the factors
        while(digit / prime != 1){
            // get the modulo
            if(digit % prime == 0){
                stackOfIntegers.push(prime);
                digit /= prime;
            }else{
                prime ++;
            }
        }
        //save the digit
        stackOfIntegers.push(digit);
    }
}
