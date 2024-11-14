/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arithmeticprog;

/**
 *
 * @author Daniel
 */


    

import java.util.Scanner;

public class ArithmeticProg {
    public static void main(String[] args) {
        
        int N1, N2, Addition, Subtraction, Multiplication, Division, Modulus, Increment, Decrement;
        
        Scanner INPUT = new Scanner(System.in);
        
       
        //Read the integer given from the console then store it into the variable 'N1'
        System.out.print("Enter Integer 1: ");
        N1 = INPUT.nextInt();
                
        //Read the integer given from the console then store it into the variable 'N2'
        System.out.print("Enter Integer 2: ");
        N2 = INPUT.nextInt();
        
        // Perform arithmetic operations
        Addition = N1 + N2;
        Subtraction = N1 - N2;
        Multiplication = N1 * N2;
        Division = N1 / N2;
        Modulus = N1 % N2;
        Increment = N1 + 1; // Display increment without modifying N1
        Decrement = N2 - 1; // Display decrement without modifying N2

        // Print results
        System.out.println("Addition: " + Addition);
        System.out.println("Subtraction: " + Subtraction);
        System.out.println("Multiplication: " + Multiplication);
        System.out.println("Division: " + Division);
        System.out.println("Modulus: " + Modulus);
        System.out.println("Increment of N1: " + Increment); 
        System.out.println("Decrement of N2: " + Decrement); 
        
        INPUT.close();
    }
}
