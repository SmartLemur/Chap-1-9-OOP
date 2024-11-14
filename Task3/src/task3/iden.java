/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task3;

/**
 *
 * @author Daniel
 */
public class iden {
    public char[] identifyGrades(int[] markah) {
        char[] grades = new char[markah.length];

        for (int i = 0; i < markah.length; i++) {
            if (markah[i] >= 80) {
                grades[i] = 'A';
            } else if (markah[i] >= 70) {
                grades[i] = 'B';
            } else if (markah[i] >= 60) {
                grades[i] = 'C';
            } else if (markah[i] >= 50) {
                grades[i] = 'D';
            } else {
                grades[i] = 'E';
            }
        }
        return grades;
    }
}