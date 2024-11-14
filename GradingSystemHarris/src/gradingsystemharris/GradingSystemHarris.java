/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradingsystemharris;

/**
 *
 * @author Daniel
 */
//import javax.swing.JOptionPane;   
//import java.util.Scanner;
//
//public class GradingSystemHarris {
//    public static void main(String[] args) {
//        boolean conprog = true;
//        Scanner labtask = new Scanner(System.in); // Create a Scanner so that user can insert their input
//
//        while (conprog) {
//            // Call method to process student marks and get results as an array
//            int[] results = processStudentMarks(labtask);
//
//            // Call method to display the results
//            displayResults(results);
//
//            // Ask the user if they want to continue using Scanner
//            System.out.print("Do you want to continue? (yes/no): ");
//            String response = labtask.next(); // Read response from console
//            
//            JOptionPane.showMessageDialog(null, "Thank you for using the program, have a nice day :)");
//            
//            // Check response to continue or exit
//            conprog = response.equalsIgnoreCase("yes");
//        }
//        
//        labtask.close(); // Close the scanner when done
//    }
//
//    // Method to process student marks and calculate grades
//    public static int[] processStudentMarks(Scanner loom) {
//        int gredA = 0, gredB = 0, gredC = 0, gredD = 0, gredF = 0;
//        int passCount = 0, failCount = 0;
//        
//        JOptionPane.showMessageDialog(null, "Welcome to Harris's Grading System");
//        
//        // Get the number of students using Scanner
//        System.out.print("Enter the number of students: ");
//        int numStudents = loom.nextInt(); // Use Scanner to read number of students
//
//        // Loop to input marks for each student and calculate grades
//        for (int i = 0; i < numStudents; i++) {
//            boolean validInput = false;
//            int mark = 0;
//
//            // Validate input between 0 and 100
//            while (!validInput) {
//                System.out.print("Enter the mark for student " + (i + 1) + " (0-100): ");
//                mark = loom.nextInt(); // Use Scanner to read marks
//
//                if (mark >= 0 && mark <= 100) {
//                    validInput = true;
//                } else {
//                    System.out.println("Invalid mark! Please enter a number between 0 and 100.");
//                }
//            }
//
//            // Assign grades based on the mark
//            if (mark >= 80) {
//                gredA++;
//                passCount++;
//            } else if (mark >= 70) {
//                gredB++;
//                passCount++;
//            } else if (mark >= 60) {
//                gredC++;
//                passCount++;
//            } else if (mark >= 50) {
//                gredD++;
//                passCount++;
//            } else {
//                gredF++;
//                failCount++;
//            }
//        }
//
//        // Return the results as an array
//        return new int[]{gredA, gredB, gredC, gredD, gredF, passCount, failCount};
//    }
//
//    // Method to display results
//    public static void displayResults(int[] results) {
//        int gradeA = results[0];
//        int gradeB = results[1];
//        int gradeC = results[2];
//        int gradeD = results[3];
//        int gradeF = results[4];
//        int passCount = results[5];
//        int failCount = results[6];
//
//        // Display the count of grades
//        JOptionPane.showMessageDialog(null,
//                "Number of students who got grade A: " + gradeA + 
//                "\nNumber of students who got grade B: " + gradeB + 
//                "\nNumber of students who got grade C: " + gradeC + 
//                "\nNumber of students who got grade D: " + gradeD + 
//                "\nNumber of students who got grade F: " + gradeF);
//
//        // Display the pass/fail counts
//        JOptionPane.showMessageDialog(null, 
//                "Number of students who passed: " + passCount + 
//                "\nNumber of students who failed: " + failCount);
//
//        // Display bonus or penalty message
//        if (passCount > failCount) {
//            JOptionPane.showMessageDialog(null, "Bonus to instructor!");
//        } else {
//            JOptionPane.showMessageDialog(null, "Penalty to instructor!");
//        }
//    }
//}

import javax.swing.JOptionPane;   
import java.util.Scanner;

public class GradingSystemHarris {
    public static void main(String[] args) {
        boolean conprog = true;
        Scanner labtask = new Scanner(System.in); // Create a Scanner for user input

        while (conprog) {
            // Call method to process student marks and get results as an array
            int[] results = processStudentMarks(labtask);

            // Call method to display the results
            displayResults(results);

            // Ask the user if they want to continue using Scanner
            System.out.print("Do you want to continue? (yes/no): ");
            String response = labtask.next(); // Read response from console

            // Check response to continue or exit
            conprog = response.equalsIgnoreCase("yes");

            // Show exit message if the user chooses not to continue
            if (!conprog) {
                JOptionPane.showMessageDialog(null, "Thank you for using the program, have a nice day :)");
            }
        }
        
        labtask.close(); // Close the scanner when done
    }

    // Method to process student marks and calculate grades
    public static int[] processStudentMarks(Scanner loom) {
        int gredA = 0, gredB = 0, gredC = 0, gredD = 0, gredF = 0;
        int passCount = 0, failCount = 0;
        
        JOptionPane.showMessageDialog(null, "Welcome to Harris's Grading System");
        
        // Get the number of students using Scanner
        System.out.print("Enter the number of students: ");
        int numStudents = loom.nextInt(); // Use Scanner to read number of students

        // Loop to input marks for each student and calculate grades
        for (int i = 0; i < numStudents; i++) {
            boolean validInput = false;
            int mark = 0;

            // Validate input between 0 and 100
            while (!validInput) {
                System.out.print("Enter the mark for student " + (i + 1) + " (0-100): ");
                mark = loom.nextInt(); // Use Scanner to read marks

                if (mark >= 0 && mark <= 100) {
                    validInput = true;
                } else {
                    System.out.println("Invalid mark! Please enter a number between 0 and 100.");
                }
            }

            // Assign grades based on the mark
            if (mark >= 80) {
                gredA++;
                passCount++;
            } else if (mark >= 70) {
                gredB++;
                passCount++;
            } else if (mark >= 60) {
                gredC++;
                passCount++;
            } else if (mark >= 50) {
                gredD++;
                passCount++;
            } else {
                gredF++;
                failCount++;
            }
        }

        // Return the results as an array
        return new int[]{gredA, gredB, gredC, gredD, gredF, passCount, failCount};
    }

    // Method to display results
    public static void displayResults(int[] results) {
        int gradeA = results[0];
        int gradeB = results[1];
        int gradeC = results[2];
        int gradeD = results[3];
        int gradeF = results[4];
        int passCount = results[5];
        int failCount = results[6];

        // Display the count of grades
        JOptionPane.showMessageDialog(null,
                "Number of students who got grade A: " + gradeA + 
                "\nNumber of students who got grade B: " + gradeB + 
                "\nNumber of students who got grade C: " + gradeC + 
                "\nNumber of students who got grade D: " + gradeD + 
                "\nNumber of students who got grade F: " + gradeF);

        // Display the pass/fail counts
        JOptionPane.showMessageDialog(null, 
                "Number of students who passed: " + passCount + 
                "\nNumber of students who failed: " + failCount);

        // Display bonus or penalty message
        if (passCount > failCount) {
            JOptionPane.showMessageDialog(null, "Bonus to instructor!");
        } else {
            JOptionPane.showMessageDialog(null, "Penalty to instructor!");
        }
    }
}
