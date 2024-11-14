/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task3;

/**
 *
 * @author Daniel
 */
public class coun {
    public int[] countGrades(char[] grades) {
        int[] count = new int[5];

        for (char grade : grades) {
            switch (grade) {
                case 'A':
                    count[0]++; //add one to grade A
                    break;
                case 'B':
                    count[1]++; //add one to grade B
                    break;
                case 'C':
                    count[2]++; //add one to grade C
                    break;
                case 'D':
                    count[3]++; //add one to grade D
                    break;
                case 'E':
                    count[4]++; //add one to grade E
                    break;
            }
        }
        return count;
    }
}
