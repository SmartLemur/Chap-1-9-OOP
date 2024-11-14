/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package displayuserinput;

/**
 *
 * @author Daniel
 */

import java.util.Scanner;

public class Displayuserinput {
    public static void main(String[] args) {
        String nama1, nama2;
        Scanner buat = new Scanner(System.in);
        
        System.out.print("Input your first name: "); 
        nama1 = buat.nextLine();
        
        System.out.print("Input your last name: "); 
        nama2 = buat.nextLine();
        
        System.out.println("\nHello"); 
        System.out.println(nama1 + " " + nama2);
        
        buat.close();
    }
}