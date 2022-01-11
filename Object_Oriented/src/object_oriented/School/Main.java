/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_oriented.School;

import java.util.Scanner;

/**
 *
 * @author Pythagoras
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter School Details: ");
        System.out.println("Enter School ID: ");
        int id = sc.nextInt();
        System.out.println("Enter School Name: ");
        String name = sc.next();
        System.out.println("Enter School Fees: ");
        Double fee = sc.nextDouble();
        
        System.out.println(" ");
        School school = new School(
                id,
                name,
                fee
        );
        
        System.out.println("School Details: ");
        school.show();
        
        
    }
}
