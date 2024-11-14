/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalmark;

import java.util.Scanner;

public class FinalMark {
    public static void main(String[] args) {
        Scanner uit = new Scanner(System.in);
         System.out.println("Enter Your Marks:"); //print enter your marks
         int number = uit.nextInt();//user input integer //accept the number given by the user
        uit.nextLine(); // input string type
        if (number >=80)//condition 1
            System.out.println("You Got an A");//print the output
        else if (number >=70)//condition 2
            System.out.println("You Got a B");//print the output
        else if (number>=50)//condition 3
            System.out.println("You Got a C");//print the output 
        else 
            System.out.println("You Got a D");//print the output
        
    }
    
}
