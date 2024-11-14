/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package age.user;

/**
 *
 * @author Daniel
 */
import java.util.Scanner;
public class AgeUser{
    public static void main(String[]args){
    
      int Biryear,age,curyear = 2024;
        
        Scanner INPUT = new Scanner(System.in);

     //Read the integer given from the console then store it into the variable 'Byear'
        
     
      System.out.print("Please Enter year Birth Year: ");
        Biryear = INPUT.nextInt();
        INPUT.close(); 
     //Age Calculation
        age = curyear - Biryear;

        System.out.println("Your age is: " + age);       
    }
}


