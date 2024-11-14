/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication28;

/**
 *
 * @author Daniel
 */
public class JavaApplication28 {
import java.util.Scanner;

public class DiscountRate {
    public static void main(String[] args) {
        
        String itemname;
        int quantity;
        float price, discrate = 0, total, afterdisc;
        
        Scanner INPUT = new Scanner(System.in);
        
        // Read the name given from the console then store it into the variable 'itemname'
        System.out.print("Enter item name: ");
        itemname = INPUT.nextLine();
        
        // Read the float given from the console then store it into the variable 'price'
        System.out.print("Enter price: ");
        price = INPUT.nextFloat();
        
        // Read the integer given from the console then store it into the variable 'quantity'
        System.out.print("Enter quantity: ");
        quantity = INPUT.nextInt();
        
        // Display the discount menu
        System.out.println("Choose discount rate from the following color codes:");
        System.out.println("1: Red (10%)");
        System.out.println("2: Blue (20%)");
        System.out.println("3: Green (30%)");
        System.out.println("4: Yellow (40%)");
        
        int discountChoice = INPUT.nextInt();
        
        // Assign discount rate based on user choice
        switch (discountChoice) {
            case 1:
                discrate = 10;
                break;
            case 2:
                discrate = 20;
                break;
            case 3:
                discrate = 30;
                break;
            case 4:
                discrate = 40;
                break;
            default:
                System.out.println("Invalid choice, no discount applied.");
                break;
        }
        
        INPUT.close();
        
        // Total Calculation
        total = price * quantity; 
        
        // Price Calculation After Discount 
        afterdisc = total * (100 - discrate) / 100; 
        
        // Display the results
        System.out.println("Item name: " + itemname);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total price: " + total);
        System.out.println("Discount rate: " + discrate + "%"); 
        System.out.println("Price after discount: " + afterdisc);
    }
}

