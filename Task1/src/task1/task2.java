/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task1;

/**
 *
 * @author Daniel
 */
import java.util.Scanner;
public class task2 {
    public void lulu(){
     Scanner suka = new Scanner(System.in);//kita punya formula untuk kasi user masukkan input
       
        char choice;

         do {
            //semua jenis data type kita
            float basesalary = 600.0f,comrate = 0.05f;
            int ayamPenyet, ayamGepuk, ayamGeprek;
            float penyetprice = 7.0f,gepukprice = 10.0f,geprekprice = 6.50f;
            float grossSales, commission, totalEarnings, penyetTotal, gepukTotal, geprekTotal;

            // akan display semua ni
            System.out.println("------------------------------------");
            System.out.println("|     * Welcome to YonCAFE*        |");
            System.out.println("------------------------------------");
            System.out.println("|            List of items         |");
            System.out.println("|   1. Ayam Penyet   : RM 7.00     |");
            System.out.println("|   2. Ayam Gepuk    : RM 10.00    |");
            System.out.println("|   3. Ayam Geprek   : RM 6.50     |");
            System.out.println("------------------------------------");
            System.out.println();

            // User masukkan berapa jumlah dorang nak
            System.out.print("Enter the number of Ayam Penyet sold: ");
            ayamPenyet = suka.nextInt();
            
            System.out.print("Enter the number of Ayam Gepuk sold: ");
            ayamGepuk = suka.nextInt();

            System.out.print("Enter the number of Ayam Geprek sold: ");
            ayamGeprek = suka.nextInt();

            // kira total
            penyetTotal = ayamPenyet * penyetprice;
            gepukTotal = ayamGepuk * gepukprice;
            geprekTotal = ayamGeprek * geprekprice;

            grossSales = penyetTotal + gepukTotal + geprekTotal;// total gross sales
            commission = grossSales * comrate; //total comission
            totalEarnings = basesalary + commission; //total earning

            // Display results
            System.out.printf("\nBase salary for the week: RM %.2f\n", basesalary);
            System.out.printf("Total commission for the week: RM %.2f\n", commission);
            System.out.printf("Total earnings for the week: RM %.2f\n", totalEarnings);

          System.out.println("Do you want to continue? (y/n): ");
            choice = suka.next().charAt(0);
            // Kita Set continueProgram based on user input
         
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Thank you for using me :D");
    }
}

