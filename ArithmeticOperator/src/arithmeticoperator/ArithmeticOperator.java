/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arithmeticoperator;
    

     
import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        
        int N1, N2, Addition, Subtraction, Multiplication; // Variable declaration
        double Division; // Declare Division as double for floating-point results
        int AO; // Arithmetic Operator choice
    
        Scanner tuka = new Scanner(System.in); // Create a Scanner object
    
        System.out.print("Enter Integer 1: "); // Prompt user for first integer
        N1 = tuka.nextInt(); // Read first integer
        
        System.out.print("Enter Integer 2: "); // Prompt user for second integer
        N2 = tuka.nextInt(); // Read second integer
        
        System.out.println("Choose Your Arithmetic Operator: ");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
    
        AO = tuka.nextInt(); // Read arithmetic operator choice 
        
        // Calculation
        Addition = N1 + N2; // Addition calculation
        Subtraction = N1 - N2; // Subtraction calculation
        Multiplication = N1 * N2; // Multiplication calculation
        Division = (double) N1 / N2; // Division calculation that can make the value into decimals
     
        switch (AO) { // Switch case to choose the arithmetic operator
            case 1: 
                System.out.println("Addition: " + Addition); 
                break; // Addition operator
            case 2: 
                System.out.println("Subtraction: " + Subtraction); 
                break; // Subtraction operator
            case 3: 
                System.out.println("Multiplication: " + Multiplication); 
                break; // Multiplication operator
            case 4: 
                System.out.println("Division: " + String.format("%.4f", Division)); //Guna string.format untuk buat decimal ikut keinginan kita nak
                break; // Division operator
            default:
                System.out.println("Invalid operator choice.");
        }
    }
}

        
    
          

