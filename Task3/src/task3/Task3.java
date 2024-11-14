/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task3;

/**
 *
 * @author Daniel
 */
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner belah = new Scanner(System.in);
        int[] marks = new int[10], counts;
        char[] grades;

        System.out.println("Please inser 10 marks of the students:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Num " + (i + 1) + ": ");
            marks[i] = belah.nextInt();
        }

        iden gradeIdentifier = new iden();
        grades = gradeIdentifier.identifyGrades(marks);

        coun gradeCounter = new coun();
        counts = gradeCounter.countGrades(grades);

        System.out.println("From the given marks:");
        System.out.println("Your grade is A: " + counts[0]);
        System.out.println("Your grade is B: " + counts[1]);
        System.out.println("Your grade is C: " + counts[2]);
        System.out.println("Your grade is D: " + counts[3]);
        System.out.println("Your grade is E: " + counts[4]);

        belah.close();
    }
}
