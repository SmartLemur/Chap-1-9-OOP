/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertsequenceinteger;

import java.util.Scanner;

public class Insertsequenceinteger {
    public static void main(String[] args) {
        boolean continueprogram = true; //booelean kita
        Scanner tisch = new Scanner(System.in);// kena letak supaya user boleh masuk input        

        while (continueprogram == true) { // untuk condition dia
            int evenCount = 0,oddCount = 0,totalnum,number; // kita punya looping
            String response;

            System.out.print("\nEnter how many integer you want: ");//akan print"\nEnter how many integer you want: "
            totalnum = tisch.nextInt();//input integers

            for (int i = 0; i < totalnum; i++) {//loop to input integers
                System.out.print("Enter integer " + (i + 1) + ": ");
                number = tisch.nextInt(); //number dari user input
                if (number % 2 == 0) { //kalau 2 boleh dibahagi 2 akan jadi even 
                    evenCount++; // untuk loop idia
                } else {//kalau tk akan jadi odd
                    oddCount++; // untuk loop dia
                }
            }
            System.out.println("Number of even integers: " + evenCount); //akan print "Number of even integers: " + hasil dari evenCount
            System.out.println("Number of odd integers: " + oddCount);// akan print "Number of odd integers: " + hasil dari oddNumber
            System.out.print("\nDo you want to continue? (yes/no): ");// Dia akan print yes/no tu
            response = tisch.next(); // response dari yes no tu 
            continueprogram = response.equalsIgnoreCase("yes");// daia mcm formula yg digunakan
        }
        tisch.close();
    }
}