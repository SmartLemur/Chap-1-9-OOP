/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package averagestudentmarks;

/**
 *
 * @author Daniel
 */
// Main.java
import java.util.Scanner;

public class AverageStudentMarks {
    public static void main(String[] args) {
        Scanner sempat = new Scanner(System.in);

       System.out.println("Enter marks for Student 1");//print
        System.out.print("Mathematics : ");//print
        double mt1 = sempat.nextDouble();// take user input
        System.out.print("Science     : ");//print
        double sc1 = sempat.nextDouble();// take user input
        System.out.print("Sejarah     : ");//print
        double sej1 = sempat.nextDouble();// take user input
        StudentMarks student1 = new StudentMarks(mt1, sc1, sej1);//used to call other class from other file
        System.out.print("   \n");//print

        System.out.println("Enter marks for Student 2");//print
        System.out.print("Mathematics : ");//print
        double mt2 = sempat.nextDouble();// take user input
        System.out.print("Science     : ");//print
        double sc2 = sempat.nextDouble();// take user input
        System.out.print("Sejarah     : ");//print
        double sej2 = sempat.nextDouble();// take user input
        StudentMarks student2 = new StudentMarks(mt2, sc2, sej2);//used to call other class from other file
        System.out.print("   \n");//print

        System.out.println("Enter marks for Student 3");//print
        System.out.print("Mathematics : ");//print
        double mt3 = sempat.nextDouble();// take user input
        System.out.print("Science     : ");//print
        double sc3 = sempat.nextDouble();// take user input
        System.out.print("Sejarah     : ");//print
        double sej3 = sempat.nextDouble();// take user input
        StudentMarks student3 = new StudentMarks(mt3, sc3, sej3);//used to call other class from other file
        System.out.print("   \n");//print
        // Calculate the average 
        double avg1 = student1.calculateAverage();
        double avg2 = student2.calculateAverage();
        double avg3 = student3.calculateAverage();

        // Display the averages
        System.out.printf("Student 1's average marks: %.2f\n", avg1);//print,give average
        System.out.printf("Student 2's average marks: %.2f\n", avg2);//print.give average
        System.out.printf("Student 3's average marks: %.2f\n", avg3);//print,give average

        // Find the highest average using MarksComparator from other file
        MarksComparator comparator = new MarksComparator();
        double highestAverage = comparator.findHighestAverage(avg1, avg2, avg3);//used to call other class from other file
        System.out.print("   \n");//print

        // Display the highest average
        System.out.printf("The highest average is: %.2f", highestAverage);

       sempat.close();
    }
}

