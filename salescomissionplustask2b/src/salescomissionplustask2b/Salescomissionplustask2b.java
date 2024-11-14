/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salescomissionplustask2b;

/**
 *
 * @author Daniel
 */
 import java.util.Scanner;
public class Salescomissionplustask2b {

    public static void main(String[] args) {
        Scanner suka = new Scanner(System.in);//kita punya formula untuk kasi user masukkan input
        boolean continueProgram = true; // boolean kita 

        while (continueProgram) { // while loop kita
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

            // Option to continue or exit
            System.out.print("\nDo you want to calculate for another week? Enter 1 for Yes, 0 for No: ");
             System.out.print("\nEnter 1 for Yes, 0 for No: ");
            int userInput = suka.nextInt();

            // Kita Set continueProgram based on user input
            if (userInput == 0) {
                continueProgram = false;
            }
        }

        System.out.println("Program exited."); // dah selesai semua kita print exit
        suka.close();
    }
}
