/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salescomission;

import java.util.Scanner;


public class Salescomission {
    public static void main(String[] args) {
        float salarybase = 600.0f,comrate = 0.05f;
        int ayampenyet, ayamgepuk, ayamgeprek;
        float hargapenyet = 7.0f, hargagepuk = 10.0f, hargageprek = 6.50f;
        float grossSales, commission, totalEarnings,geprekTotal,gepukTotal,penyetTotal;

        Scanner MOO = new Scanner(System.in);//Formula yg kena ada bila user nak masuk input
        
        //akan print semua ni
        System.out.println("------------------------------------");
System.out.println("|         Welcome to YonCAFE        |");
System.out.println("------------------------------------");
System.out.println("|            List of item           |");
System.out.println("|   1. Ayam Penyet   : RM 7.00      |");
System.out.println("|   2. Ayam Gepuk    : RM 10.00     |");
System.out.println("|   3. Ayam Geprek   : RM 6.50      |");
System.out.println("_");
System.out.println("");
       
        System.out.print("Enter the number of Ayam Penyet sold: ");// akan print"Enter the number of Ayam Penyet sold: "
        ayampenyet = MOO.nextInt();// user enter total items sold

        System.out.print("Enter the number of Ayam Gepuk sold: ");//akan print "Enter the number of Ayam Gepuk sold: "
        ayamgepuk = MOO.nextInt();//user enter total items sold

        System.out.print("Enter the number of Ayam Penyet sold: ");//akan print "Enter the number of Ayam Penyet sold: "
        ayamgeprek = MOO.nextInt();//user enter total items sold

        penyetTotal = ayampenyet * hargapenyet; // total price for ayam penyet
        gepukTotal = ayamgepuk * hargagepuk;    //total price for ayam gepuk
        geprekTotal = ayamgeprek * hargageprek; //total price for ayam geprek

        grossSales = penyetTotal + gepukTotal + geprekTotal;//calcucalte gross
        commission = grossSales * comrate;//calcucalte commission
        totalEarnings = salarybase + commission;//calcucalte total earning
            
        System.out.printf("\nBase salary for the week: RM %.2f\n", salarybase); //akan print "Base salary for the week: RM"+ jumlah salary base in 2 titik perpuluhan(RM) 
        System.out.printf("Total commission for the week: RM %.2f\n", commission);//akan print "Total commission for the week: RM"+ jumlah salary base in 2 titik perpuluhan(RM)
        System.out.printf("Total earnings for the week: RM %.2f\n", totalEarnings);//akan print "Total earnings for the week: RM"+ jumlah salary base in 2 titik perpuluhan(RM)              
        MOO.close();
    }
}
