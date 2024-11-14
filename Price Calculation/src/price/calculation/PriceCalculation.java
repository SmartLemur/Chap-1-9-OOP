/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package price.calculation;

/**
 *
 * @author Daniel
 */

 import java.util.Scanner;
 public class PriceCalculation{
    public static void main(String[]args){
        
        String itemname;
        int quantity;
        float price,discrate,total,afterdisc;
        
        Scanner INPUT = new Scanner(System.in);
        
        //  //Read the name given from the console then store it into the variable 'itemname'
        System.out.print("Enter item name: ");
        itemname = INPUT.nextLine();
        
         //Read the integer given from the console then store it into the variable 'price'
        System.out.print("Enter price: ");
        price = INPUT.nextFloat();
        
        //Read the integer given from the console then store it into the variable 'quantity'
        System.out.print("Enter quantity: ");
        quantity = INPUT.nextInt();
        
        //Read the integer given from the console then store it into the variable 'discrate'
        System.out.print("Enter discount rate: ");
        discrate = INPUT.nextFloat();
        INPUT.close();
        
        //Total Calculation
        total = price * quantity; 
        //Price Calculation After Discount 
        afterdisc = total*(100-discrate)/100; 
        
        System.out.println("Item name: " + itemname);//print name
        System.out.println("Price: " + price);//print price
        System.out.println("Quantity: " + quantity);//print quantity
        System.out.println("Total price: " + total);//print total
        System.out.println("Discount rate: " + discrate); //print rate
        System.out.println("Price after discount: " + afterdisc);//print after discount
    }
}