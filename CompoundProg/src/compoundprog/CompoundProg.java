/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

public class CompoundProg {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Read initial value from the user
        System.out.print("Enter a number: ");
        int initValue = scanner.nextInt();
        
        int N1 = initValue, N2 = initValue, N3 = initValue, N4 = initValue;
        
        // Pre-increment will increase the value of N1 by 1, then returns N1
        int preIncrement = ++N1;
        System.out.println("Pre-increment:");
        System.out.println("Initial value: " + initValue);
        System.out.println("After pre-increment (++N1): " + preIncrement);
        System.out.println("Final value of N1: " + N1);

        // Post-increment will return the value of N2, then increments N2 by 1
        int postIncrement = N2++;
        System.out.println("\nPost-increment:");
        System.out.println("Initial value: " + initValue);
        System.out.println("After post-increment (N2++): " + postIncrement);
        System.out.println("Final value of N2: " + N2);
        
        // Pre-decrement will decrease N3 by 1, then returns N3
        int preDecrement = --N3;
        System.out.println("\nPre-decrement:");
        System.out.println("Initial value: " + initValue);
        System.out.println("After pre-decrement (--N3): " + preDecrement);
        System.out.println("Final value of N3: " + N3);

        // Post-decrement will return N4, then decrements N4 by 1
        int postDecrement = N4--;
        System.out.println("\nPost-decrement:");
        System.out.println("Initial value: " + initValue);
        System.out.println("After post-decrement (N4--): " + postDecrement);
        System.out.println("Final value of N4: " + N4);

        scanner.close();
    }
}

