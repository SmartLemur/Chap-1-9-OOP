/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifdemo;

/**
 *
 * @author Daniel
 */
import java.util.Scanner;
public class IfDemo {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
          System.out.println("Enter student Grade:");
        int number = input.nextInt();
        input.nextLine();
        if (number >=60)
            System.out.println("Passed");
        else
            System.out.println("Failed");            
       
                
        
    }
    
}
