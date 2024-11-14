/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student.marks;

/**
 *
 * @author Daniel
 */
import java.util.Scanner;
public class StudentMarks{
    public static void main(String[]args){
        int age,birthyear,currentyear = 2024;
        
        Scanner INPUT = new Scanner(System.in);

        
        System.out.print("Enter your birth year: ");
        birthyear = INPUT.nextInt();
        INPUT.close(); 

        age = currentyear - birthyear;

        System.out.println("Your age is: " + age);       
    }
}
