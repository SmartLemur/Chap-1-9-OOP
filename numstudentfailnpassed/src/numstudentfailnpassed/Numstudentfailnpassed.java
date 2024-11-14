/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numstudentfailnpassed;

import java.util.Scanner;

public class Numstudentfailnpassed {
    public static void main(String[] args) {
        Scanner lemau = new Scanner(System.in);// kena letak supaya user boleh type input

        System.out.print("Enter the number of students: ");
        int numStudents = lemau.nextInt();// input dari user akan disimpan dalam variable numStudnets

        int passCount = 0;
        int failCount = 0;

        for (int i = 0; i < numStudents; i++) { //untuk looping jumlah student kita masukkan
            System.out.print("Enter the test result for student " + (i + 1) + ": ");// dia akan print "enter the test result for student" pastu tambah satu dari number previous  
            int result = lemau.nextInt(); //input dari jumlh student yg dimasukkan dari input sebelum ni akan dimasukkan ke dalam result

            if (result >= 50) { //condition untuk markah yg lulus
                passCount++;//dia akan kira jumlah yg lulus dari 1 dan seterusnya
            } else {
                failCount++; //dia akan kira jumlah yg gagal dari 1 dan seterusnya
            }
        }

        System.out.println("Number of students who passed: " + passCount); //akan print "Number of students who passed: " + jumlah yg lulus
        System.out.println("Number of students who failed: " + failCount);//akan print "Number of students who failed: " + jumlah yg gagal

        double passPercentage = (double) passCount / numStudents * 100;// formula untuk kira markah student
        if (passPercentage > 50) { //condition untuk tengok layak tak instructor dpt bonus
            System.out.println("Bonus to instructor!"); // akan print"Bonus to instructor!"
        }

        lemau.close();
    }
}