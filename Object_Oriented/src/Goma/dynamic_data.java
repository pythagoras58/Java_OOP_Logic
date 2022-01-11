/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Goma;

import java.util.Scanner;

/**
 *
 * @author Pythagoras
 */
public class dynamic_data {
    
    //entry point of the application
    public static void main(String[] args) {
        
        //call the inbuild scanner class 
        Scanner sc = new Scanner(System.in);
        
        //lets get the Employee Data
        System.out.println("Enter Employee Details: ");
        
        System.out.println("Enter Employee ID: ");
        int id = sc.nextInt();
        
        System.out.println("Enter Employee Salary: ");
        int salary = sc.nextInt();
        
        System.out.println("Enter Employee Name: ");
        String name = sc.next();
        
        System.out.println("Enter Employee Department: ");
        String department = sc.next();
        
         System.out.println("Enter Employee Address: ");
         String address = sc.next();
         
        System.out.println("Enter Employee Contact: ");
        String contact = sc.next();
        
        System.out.println("Enter Employee Role: ");
        String role = sc.next();
        
        //display the info
        
        //get the constructor of the employee class
        Employee em = new Employee(
                id,
                salary,
                name,
                department,
                address,
                contact,
                role
        );
        
        System.out.println("=============================");
        System.out.println("Employee Details: ");
        
        // show the inputed data
        em.toString();
        
          
    }
    
}
