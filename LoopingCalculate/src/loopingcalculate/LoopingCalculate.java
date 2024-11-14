/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopingcalculate;

/**
 *
 * @author Daniel
 */
public class LoopingCalculate {

  
    public static void main(String[] args) {
        
        int sum;

        // for loop
        sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum using for loop: " + sum);

        // while loop
        sum = 0;
        int j = 1;
        while (j <= 10) {
            sum += j;
            j++;
        }
        System.out.println("Sum using while loop: " + sum);

        // do-while loop
        sum = 0;
        int k = 1;
        do {
            sum += k;
            k++;
        } while (k <= 10);
        System.out.println("Sum using do-while loop: " + sum);
    }
}

    
    

