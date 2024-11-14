/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package example2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        boolean continueProgram = true;  // Loop control variable

        while (continueProgram) {
            System.out.print("Enter the number of students: ");
            int numStudents = test.nextInt();

            int gradeA = 0, gradeB = 0, gradeC = 0, gradeD = 0, gradeF = 0;
            int passCount = 0, failCount = 0;

            // Collect marks and determine grades
            for (int i = 1; i <= numStudents; i++) {
                System.out.print("Enter mark for student " + i + ": ");
                int mark = test.nextInt();
                
                // Determine grade and count the pass/fail
                if (mark >= 90) {
                    gradeA++;
                    passCount++;
                } else if (mark >= 80) {
                    gradeB++;
                    passCount++;
                } else if (mark >= 70) {
                    gradeC++;
                    passCount++;
                } else if (mark >= 60) {
                    gradeD++;
                    passCount++;
                } else {
                    gradeF++;
                    failCount++;
                }
            }
            
            
              System.out.println("\nGrade Marks Calculation:");
            System.out.println("_____________________");
            System.out.println("| 1. A: 90 and above |");
            System.out.println("| 2. B: 80 and above |");
            System.out.println("| 3. C: 70 and above |");
            System.out.println("| 4. D: 60 and above |");
            System.out.println("| 5. F: 50 and above |");
            System.out.println("|____________________|");
         


            // Display grade distribution
            System.out.println("\nGrade distribution:");
            System.out.println("A: " + gradeA);
            System.out.println("B: " + gradeB);
            System.out.println("C: " + gradeC);
            System.out.println("D: " + gradeD);
            System.out.println("F: " + gradeF);

            // Display pass and fail count
            System.out.println("\nNumber of students who passed: " + passCount);
            System.out.println("Number of students who failed: " + failCount);

            // Bonus to instructor logic
            if (passCount > failCount) {
                System.out.println("Bonus to instructor");
            } else {
                System.out.println("Instructor needs to work harder");
            }

            // Continue or exit the program
            System.out.print("\nDo you want to continue? (yes/no): ");
            String userInput = test.next();
            continueProgram = userInput.equalsIgnoreCase("yes");

            System.out.println();
        }

        System.out.println("Exiting program. Goodbye!");
        test.close();

        System.out.println("Exiting program. Goodbye!");
        test.close();
    }
}

