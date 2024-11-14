/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interactiveprog;

import java.util.Scanner;
public class Interactiveprog {
//    public static void main(String[] args) {
//        Scanner ohohoh = new Scanner(System.in);
//       
//        System.out.print("Enter a positive integer: ");
//        int jumnum = ohohoh.nextInt(); // Get user input
//
//        if (jumnum < 0) { 
//            System.out.println("Factorial is not defined for negative numbers.");
//        } else {
//            int factorial = 1; // Variable kita gunakan untuk store the factorial
//
//            // untuk display the factorial calculation
//           System.out.print(jumnum + "! = "); // digunakan untuk print ! sebelah integer kita
//            for (int i = jumnum; i > 0; i--) { // kitqa punya for conditions
//                System.out.print(i);
//                if (i > 1) {
//                    System.out.print(" * "); // untuk display multiplication symbol
//                }
//                factorial *= i; // akan calculate factorial
//            }           
//           System.out.println(" = " + factorial);// akan display the result
//        }
//       ohohoh.close(); // Close the scanner
//   }
//}


    public static void main(String[] args) {
       int nom = 3,factorial = 1; 

        System.out.print(nom + "! = ");
        for (int i = nom; i > 0; i--) {//looping kita
            System.out.print(i);// akan print number kita
            if (i > 1) {//condition dia
                System.out.print(" * "); // Display multiplication symbol
            }
            factorial *= i; // Calculate total factorial
        }        
        System.out.println(" = " + factorial);// Display result
    }
}
