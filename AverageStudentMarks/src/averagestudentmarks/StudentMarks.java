/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package averagestudentmarks;

/**
 *
 * @author Daniel
 */
// StudentMarks
public class StudentMarks {
     double mathMarks;
     double scienceMarks;
     double historyMarks;

    // Constructor used  
    public StudentMarks(double mathInput, double scienceInput, double historyInput) {
        mathMarks    = mathInput;
        scienceMarks = scienceInput;
        historyMarks = historyInput;
    }

    // Method to calculate the average
    public double calculateAverage() {
        return (mathMarks + scienceMarks + historyMarks) / 3;
    }
}
