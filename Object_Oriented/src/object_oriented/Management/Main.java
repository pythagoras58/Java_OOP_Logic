/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_oriented.Management;

/**
 *
 * @author Pythagoras
 */
public class Main {
    
    public static void main(String[] args) {
        
        Management mg = new Management(
                "Abena Pokuaa",
                "Gegov Manager",
                8600
        );
        
        System.out.println("Name of Manager: " + mg.getName());
        System.out.println("Managerial Position: " + mg.getPosition());
        System.out.println("Salary: " + mg.getSalary());
    }
}
