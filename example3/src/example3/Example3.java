/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package example3;

/**
 *
 * @author Daniel
 */

//import java.util.Scanner;
//
//public class Example3 {
//    public static void main(String[] args) {
//        boolean continueprogram = true; //booelean kita
//        Scanner tisch = new Scanner(System.in);// kena letak supaya user boleh masuk input        
//
//        while (continueprogram == true) { // untuk condition dia
//            int evenCount = 0,oddCount = 0,totalnum,number; // kita punya looping
//            String response;
//
//            System.out.print("\nEnter how many integer you want: ");//akan print"\nEnter how many integer you want: "
//            totalnum = tisch.nextInt();//input integers
//
//            for (int i = 0; i < totalnum; i++) {//loop to input integers
//                System.out.print("Enter integer " + (i + 1) + ": ");
//                number = tisch.nextInt(); //number dari user input
//                if (number % 2 == 0) { //kalau 2 boleh dibahagi 2 akan jadi even 
//                    evenCount++; // untuk loop idia
//                } else {//kalau tk akan jadi odd
//                    oddCount++; // untuk loop dia
//                }
//            }
//            System.out.println("Number of even integers: " + evenCount); //akan print "Number of even integers: " + hasil dari evenCount
//            System.out.println("Number of odd integers: " + oddCount);// akan print "Number of odd integers: " + hasil dari oddNumber
//            System.out.print("\nDo you want to continue? (yes/no): ");// Dia akan print yes/no tu
//            response = tisch.next(); // response dari yes no tu 
//            continueprogram = response.equalsIgnoreCase("yes");// daia mcm formula yg digunakan
//        }
//        tisch.close();
//    }
//}

//import javax.swing.JOptionPane;
//
//public class Example3 {
//    public static void main(String[] args) {
//        boolean continueProgram = true;
//
//        while (continueProgram) {
//            int numStudents, mark, gradeA = 0, gradeB = 0, gradeC = 0, gradeD = 0, gradeF = 0;
//            int passCount = 0, failCount = 0;
//            String response;
//
//            // Get the number of students
//            String numStudentsInput = JOptionPane.showInputDialog(null, 
//                    "Enter the number of students:");
//            numStudents = Integer.parseInt(numStudentsInput);
//
//            // Loop to input marks for each student and calculate grades
//            for (int i = 0; i < numStudents; i++) {
//                boolean validInput = false;
//
//                // Loop until a valid mark is entered (between 0 and 100)
//                while (!validInput) {
//                    String markInput = JOptionPane.showInputDialog(null, 
//                            "Enter the mark for student " + (i + 1) + " (0-100):");
//                    mark = Integer.parseInt(markInput);
//
//                    if (mark >= 0 && mark <= 100) {
//                        validInput = true; // Break the loop if input is valid
//
//                        // Assign grades based on the mark
//                        if (mark >= 80) {
//                            gradeA++;
//                            passCount++;
//                        } else if (mark >= 70) {
//                            gradeB++;
//                            passCount++;
//                        } else if (mark >= 60) {
//                            gradeC++;
//                            passCount++;
//                        } else if (mark >= 50) {
//                            gradeD++;
//                            passCount++;
//                        } else {
//                            gradeF++;
//                            failCount++;
//                        }
//                    } else {
//                        // If input is invalid, show an error message
//                        JOptionPane.showMessageDialog(null, 
//                                "Invalid mark! Please enter a number between 0 and 100.");
//                    }
//                }
//            }
//
//            // Display the count of grades
//            JOptionPane.showMessageDialog(null,
//                    "Number of students who got grade A: " + gradeA + 
//                    "\nNumber of students who got grade B: " + gradeB + 
//                    "\nNumber of students who got grade C: " + gradeC + 
//                    "\nNumber of students who got grade D: " + gradeD + 
//                    "\nNumber of students who got grade F: " + gradeF);
//
//            // Display the pass/fail counts
//            JOptionPane.showMessageDialog(null, 
//                    "Number of students who passed: " + passCount + 
//                    "\nNumber of students who failed: " + failCount);
//
//            // Display bonus or penalty message
//            if (passCount > failCount) {
//                JOptionPane.showMessageDialog(null, "Bonus to instructor!");
//            } else {
//                JOptionPane.showMessageDialog(null, "Penalty to instructor!");
//            }
//
//            // Ask the user if they want to continue
//            response = JOptionPane.showInputDialog(null, 
//                    "Do you want to continue? (yes/no):");
//
//            // Check response to continue or exit
//            continueProgram = response.equalsIgnoreCase("yes");
//        }
//    }
//}
import javax.swing.JOptionPane;

public class Example3 {
    public static void main(String[] args) {
        boolean continueProgram = true;

        while (continueProgram) {
            // Call method to process student marks and get results as an array
            int[] results = processStudentMarks();

            // Call method to display the results
            displayResults(results);

            // Ask the user if they want to continue
            String response = JOptionPane.showInputDialog(null, 
                    "Do you want to continue? (yes/no):");
            
            // Check response to continue or exit
            continueProgram = response.equalsIgnoreCase("yes");
        }
    }

    // Method to process student marks and calculate grades
    public static int[] processStudentMarks() {
        int gredA = 0, gredB = 0, gredC = 0, gredD = 0, gredF = 0;
        int passCount = 0, failCount = 0;

        // Get the number of students
        String numStudentsInput = JOptionPane.showInputDialog(null, 
                "Enter the number of students:");
        int numStudents = Integer.parseInt(numStudentsInput);

        // Loop to input marks for each student and calculate grades
        for (int i = 0; i < numStudents; i++) {
            boolean validInput = false;
            int mark = 0;

            // Validate input between 0 and 100
            while (!validInput) {
                String markInput = JOptionPane.showInputDialog(null, 
                        "Enter the mark for student " + (i + 1) + " (0-100):");
                mark = Integer.parseInt(markInput);

                if (mark >= 0 && mark <= 100) {
                    validInput = true;
                } else {
                    JOptionPane.showMessageDialog(null, 
                            "Invalid mark! Please enter a number between 0 and 100.");
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