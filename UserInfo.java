/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package user.info;

/**
 *
 * @author Daniel
 */
import java.util.Scanner;
public class UserInfo {

   public static void main(String[] args) {

        String name;
        int age;
        String hobby;
        String food;
        
        Scanner no = new Scanner(System.in);
        
        // c
        System.out.print("Enter Your Name: ");
        name = no.nextLine();  
        
        //Read the integer given from the console then store it into the variable 'age'
        System.out.print("Enter Your Age: ");
        age = no.nextInt();  
        
         no.nextLine();
        
        System.out.print("Enter Your Hobby: ");
        hobby = no.nextLine();
        
        
     
        System.out.print("Enter Your Favorite Food: ");
        food = no.nextLine();
        no.close();
       
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hobby " + hobby);
        System.out.println("Food " + food);
    }
}
