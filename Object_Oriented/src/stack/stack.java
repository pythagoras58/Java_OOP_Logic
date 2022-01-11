/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Stack;

/**
 *
 * @author Pythagoras
 */
public class stack {
    
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        
        //System.out.println(stack.empty());
        
        // Add items to the stack
        stack.push("Java");
        stack.push("C++");
        stack.push("Python");
        stack.push("PHP");
        stack.push("DevOP");
        
        System.out.println(stack);
        
        //pop the items up
        stack.pop();
        stack.pop();
        
        
        
    }
    
}
