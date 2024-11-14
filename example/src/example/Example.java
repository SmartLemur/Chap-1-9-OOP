/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package example;

/**
 *
 * @author Daniel
 */

// import java.util.Scanner;
//
//public class Example {
//    public static void main(String[] args) {
//        Scanner test = new Scanner(System.in);
//        boolean continueProgram = true;
//
//        while (continueProgram) {
//            System.out.print("Enter the number of students: ");
//            int numStudents = test.nextInt();
//
//            int[] marks = new int[numStudents];
//            char[] grades = new char[numStudents];
//            int gradeA = 0, gradeB = 0, gradeC = 0, gradeD = 0, gradeF = 0;
//            int passCount = 0, failCount = 0;
//
//            // Collect marks and determine grades
//            for (int i = 0; i < numStudents; i++) {
//                System.out.print("Enter mark for student " + (i + 1) + ": ");
//                marks[i] = test.nextInt();
//                grades[i] = getGrade(marks[i]);
//
//                // Count grades
//                switch (grades[i]) {
//                    case 'A': gradeA++; passCount++; break;
//                    case 'B': gradeB++; passCount++; break;
//                    case 'C': gradeC++; passCount++; break;
//                    case 'D': gradeD++; passCount++; break;
//                    case 'F': gradeF++; failCount++; break;
//                }
//            }
//
//             System.out.println("\nGrade Marks Calculation:");
//            System.out.println("A: 90 and above");
//            System.out.println("B: 80 and above");
//            System.out.println("C: 70 and above");
//            System.out.println("D: 60 and above");
//            System.out.println("F: 50 and above");
//
//            // Display grade distribution
//            System.out.println("\nGrade distribution:");
//            System.out.println("A: " + gradeA);
//            System.out.println("B: " + gradeB);
//            System.out.println("C: " + gradeC);
//            System.out.println("D: " + gradeD);
//            System.out.println("F: " + gradeF);
//
//            // Display pass and fail count
//            System.out.println("\nNumber of students who passed: " + passCount);
//            System.out.println("Number of students who failed: " + failCount);
//
//            // Bonus to instructor logic
//            if (passCount > failCount) {
//                System.out.println("Bonus to instructor");
//            } else {
//                System.out.println("Instructor needs to work harder");
//            }
//
//            // Continue or exit the program
//            System.out.print("\nDo you want to continue? (yes/no): ");
//            String userInput = test.next();
//            continueProgram = userInput.equalsIgnoreCase("yes");
//
//            System.out.println();
//        }
//
//        System.out.println("Exiting program. Goodbye!");
//        test.close();
//    }
//
//    // Method to get grade based on marks
//    public static char getGrade(int mark) {
//        if (mark >= 90) return 'A';
//        else if (mark >= 80) return 'B';
//        else if (mark >= 70) return 'C';
//        else if (mark >= 60) return 'D';
//        else return 'F';
//    }
//}

//import javax.swing.JOptionPane;
//
//public class Example {
//    public static void main(String[] args) {
//        int random_number = 4;  // The correct number to guess
//        int attempts = 0;
//        boolean guessedCorrectly = false;
//
//        do {
//            // Display input dialog and store user's input
//            String input = JOptionPane.showInputDialog(null, "Guess the number (1 to 10):");
//
//            // Check if the user clicked "Cancel" (input is null)
//            if (input == null) {
//                JOptionPane.showMessageDialog(null, "You canceled the game.");
//                break;  // Exit the loop and the program
//            }
//
//            // Check if the input is a valid number using a simple condition
//            if (input.matches("\\d+")) {  // Check if input is a number
//                int userInput = Integer.parseInt(input);  // Convert input to integer
//
//                // Check if the user guessed correctly
//                if (userInput == random_number) {
//                    JOptionPane.showMessageDialog(null, "Congratulations! You guessed the right number.");
//                    guessedCorrectly = true;  // Exit the loop
//                } else {
//                    JOptionPane.showMessageDialog(null, "Wrong guess, try again.");
//                }
//            } else {
//                JOptionPane.showMessageDialog(null, "Please enter a valid number.");
//            }
//
//            attempts++;  // Count the number of attempts
//        } while (!guessedCorrectly && attempts < 10);  // Loop until guessed or 10 attempts
//
//        // If the user didn't guess correctly after 10 attempts
//        if (!guessedCorrectly && attempts == 10) {
//            JOptionPane.showMessageDialog(null, "You've reached the maximum attempts. The correct number was " + random_number);
//        }
//    }
//}

import javax.swing.JOptionPane;

public class Example {
    public static void main(String[] args) {
        int random_number = 4;  // The correct number to guess
        int attempts = 0;
        int maxAttempts = 10;  // Maximum number of attempts
        boolean guessedCorrectly = false;

        do {
            // Display input dialog and store user's input
            String input = JOptionPane.showInputDialog(null, 
                "Guess the number (1 to 10):\nRemaining chances: " + (maxAttempts - attempts));

            // Check if the user clicked "Cancel" (input is null)
            if (input == null) {
                JOptionPane.showMessageDialog(null, "You canceled the game.");
                break;  // Exit the loop and the program
            }

            // Check if the input is a valid number using a simple condition
            if (input.matches("\\d+")) {  // Check if input is a number
                int userInput = Integer.parseInt(input);  // Convert input to integer

                // Check if the user guessed correctly
                if (userInput == random_number) {
                    JOptionPane.showMessageDialog(null, "Congratulations! You guessed the right number.");
                    guessedCorrectly = true;  // Exit the loop
                } else {
                    int remainingAttempts = maxAttempts - attempts - 1;
                    JOptionPane.showMessageDialog(null, 
                        "Wrong guess. You have " + remainingAttempts + " chances left.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please enter a valid number.");
            }

            attempts++;  // Count the number of attempts
        } while (!guessedCorrectly && attempts < maxAttempts);  // Loop until guessed or 10 attempts

        // If the user didn't guess correctly after 10 attempts
        if (!guessedCorrectly && attempts == maxAttempts) {
            JOptionPane.showMessageDialog(null, "You've reached the maximum attempts. The correct number was " + random_number);
        }
    }
}
