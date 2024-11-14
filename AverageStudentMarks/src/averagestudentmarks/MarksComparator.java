/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package averagestudentmarks;

/**
 *
 * @author Daniel
 */
// 
public class MarksComparator {
    // Method to compare and find the highest average using Math.max
    public double findHighestAverage(double avg1, double avg2, double avg3) {
        return Math.max(avg1, Math.max(avg2, avg3));
    }
}

