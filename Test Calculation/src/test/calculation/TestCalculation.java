/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test.calculation;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
public class TestCalculation{
    
    public static void main(String[]args){
        String name,id,subject;
        float T1,T2,average;
        
       Scanner INPUT = new Scanner(System.in);
        //Read a single line from the console
       System.out.print("Enter your name: ");
       name = INPUT.nextLine();
       
    //Read a single line from the console
      System.out.print("Enter your Student ID: ");
        id = INPUT.nextLine();

       //Read a single line from the console
       System.out.print("Enter your subject: ");
        subject = INPUT.nextLine();
        
       //Read a float from the console
        System.out.print("Enter Test1 marks (/100): ");
       T1 = INPUT.nextFloat();

        //Read a float from the console
        System.out.print("Enter Test2 marks (/100): ");
        T2 = INPUT.nextFloat();
        INPUT.close();

       average = (T1 + T2) / 2;//Average calcualtion
       System.out.println("ID: " + id);//Print The ID
       System.out.println("Subject: " + subject);//Print the subject choosen
       System.out.println("Average Mark: " + average);//Print the Average calculation
   }
}

