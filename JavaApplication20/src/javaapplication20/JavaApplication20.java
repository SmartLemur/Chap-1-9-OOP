/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication20;

/**
 *
 * @author Daniel
 */
import java.util.Scanner;//import 
public class JavaApplication20 {// public class that used to 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //user insert the number
        System.out.print("insert late number: ");
        int latenumber = input.nextInt();
        input.nextLine();
        float deductmarks = (float) 0.3;
        float totalKISmark = 0;
        float balance;
        if (latenumber >3)
        {
            totalKISmark = latenumber * deductmarks;//calculation of total kis mark
            balance = 10 - totalKISmark;
            System.out.println("Total KIS Mark:"+ totalKISmark);
            System.out.println("Balance KIS mark:"+ balance);
        }
        
    }
}

