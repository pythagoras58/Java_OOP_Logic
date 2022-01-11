/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_oriented.Selection;
import java.util.*;

/**
 *
 * @author Pythagoras
 */
public class Radius {
    
    public static void main(String[] args) {
        int radius;
        double circumference;
        Scanner sc = new Scanner(System.in);
        
        //Accept the value of the radius of the user
        System.out.println("Enter Your Radius for computation");
        radius = sc.nextInt();
        
        //Business logic
        if(radius < 0){
            System.out.println("Negative Radius not accepted");
        }
        else{
            if(radius == 0){
                System.out.println("Radius cannot be zero");
            }
            
            if(radius > 0){
                circumference = 3.14 * (radius * radius);
                System.out.println("The Circumference is: " + circumference);
            }
        }
    }
    
}
