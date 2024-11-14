/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package noninteractive;

public class Noninteractive {
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

