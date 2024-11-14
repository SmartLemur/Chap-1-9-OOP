/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package userbmi;

/**
 *
 * @author Daniel
 */

import java.util.Scanner;
public class UserBMI{
    
    public static void main(String[]args){
        
        float bmi,WGT,HGT;
        Scanner INPUT = new Scanner(System.in);

      //Read the weight given from the console then store it into the variable 'weight'
       System.out.print("Enter your weight in kg: ");
        WGT = INPUT.nextFloat();

       //Read the height given from the console then store it into the variable 'height'
       System.out.print("Enter your height in metre: ");
       HGT = INPUT.nextFloat();
       INPUT.close();
       
       // BMI Calculation
       bmi = WGT / (HGT * HGT);

       //Print BMI
       System.out.println("Your BMI is: " + bmi);
   }
}
