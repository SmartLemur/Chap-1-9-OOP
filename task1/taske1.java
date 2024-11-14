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

public class taske1 {
    public static void main(String[] args) {
        boolean continueInput = true;
        int max,min;
        
        Scanner mon = new Scanner(System.in); // Create Scanner object

        while (continueInput) {
            int[] numbers = new int[3]; 
          
            for (int i = 0; i < 3; i++) { 
                System.out.print("Please give me th number number " + (i + 1) + ": ");
                numbers[i] = mon.nextInt();
            }

            Task1MAX myMaxNumber = new Task1MAX();
            max = myMaxNumber.maxnum(numbers); 

            TASK1MIN myMinNumber = new TASK1MIN(); 
            min = myMinNumber.minnum(numbers); 

            System.out.println("The maximum value is: " + max);
            System.out.println("The minimum value is: " + min);
        
            System.out.print("Do you want to continue? (yes/no): ");  
            continueInput = mon.next().equalsIgnoreCase("yes");    
        }
        System.out.println("Thank you :)");
        mon.close(); 
    }
}


    
