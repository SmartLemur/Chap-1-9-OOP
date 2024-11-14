/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainclass;

/**
 *
 * @author Daniel
 */
  import java.util.Scanner;
public class TASK1 {
    public void pupu(){
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three integers
        System.out.println("Enter the first integer: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter the second integer: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Enter the third integer: ");
        int num3 = scanner.nextInt();

        // Find the maximum and minimum using Math class methods
        int maxValue = Math.max(num1, Math.max(num2, num3));
        int minValue = Math.min(num1, Math.min(num2, num3));

        // Display the results
        System.out.println("Maximum value: " + maxValue);
        System.out.println("Minimum value: " + minValue);
    }
}


