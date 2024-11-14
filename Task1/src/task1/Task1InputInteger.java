/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task1;

/**
 *
 * @author Daniel
 */
import java.util.Scanner;
public class Task1InputInteger {
     public void pupu(){
  
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input three integers
        System.out.println("Enter integer 1: ");
        int integer1 = scanner.nextInt();

        System.out.println("Enter integer 2: ");
        int integer2 = scanner.nextInt();

        System.out.println("Enter integer 3: ");
        int integer3 = scanner.nextInt();

        // Display the entered integers
        System.out.println("You entered:");
        System.out.println("Integer 1: " + integer1);
        System.out.println("Integer 2: " + integer2);
        System.out.println("Integer 3: " + integer3);
    }
}


