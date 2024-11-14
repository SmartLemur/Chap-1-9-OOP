/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package input.exp;

/**
 *
 * @author Daniel
 */



import java.util.Scanner;

public class InputExp {

    public static void main(String[] args) {

        String name;
        int age;
        String ID;
        Scanner no = new Scanner(System.in);
        
        // Reads a single line from the console
        // and stores into name variable
        System.out.print("Enter Your Name: ");
        name = no.nextLine();  
        
        // Reads an integer from the console
        // and stores into age variable
        System.out.print("Enter Your Age: ");
        age = no.nextInt();  
        
        // Consume the remaining newline
        no.nextLine();
        
        System.out.print("Enter Your StudentID: ");
        ID = no.nextLine();
        no.close();
        
        
        // Prints name, age, and ID to the console
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("StudentID: " + ID);
    }
}

//import java.io.*;
//public class Main {
//    
//    public static void main(String[] args) throws
//IOException{
//        BufferedReader stdin = new BufferedReader(
//                  new InputStreamReader(System.in));
//        int mark;
//        
//        System.out.print("Enter Mark: ");
//        mark = Integer.parseInt(stdin.readLine());
//    }
//}