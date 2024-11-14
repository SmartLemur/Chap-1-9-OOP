/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1,lim,nextnum;
        
       Scanner genji = new Scanner(System.in);
       
        System.out.print("Enter an integer : ");
        lim = genji.nextInt(); // Get the upper limit from the user

        System.out.print("Fibonacci for num  " + lim + ": ");
        
        if (lim < 0) {
            System.out.println("Please enter a positive number.");//enter positive num only
        } else if (lim == 0) {
            System.out.println(num1); // If the limit is 0, only print 0
        } else {
            // Print the Fibonacci series until that number
            while (num1 <= lim) {
                System.out.print(num1 + " ");
               nextnum = num1 + num2; // Calculate the next Fibonacci number
                num1 = num2; // Update a to b after add
               num2 = nextnum; // Update b to 'next number'
            }
        }
        genji.close(); // Close the scanner
    }
}
