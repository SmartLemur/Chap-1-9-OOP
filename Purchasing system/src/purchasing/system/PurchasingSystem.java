/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package purchasing.system;

import java.util.Scanner;

/**
 *
 * @author Daniel
 * 
 */
public class PurchasingSystem{
    public static void main(String[] args) {
        String itemName = "",confirmation;        
        int productQuan,productChoice;            
        float ItemPrice = 0,totalCost = 0;                   

        Scanner what = new Scanner(System.in);
        
        //print the Shop Interface
        System.out.println("***********************************");   
        System.out.println("     Selamat Datang Ke YonCafe     ");    
        System.out.println("***********************************");
        System.out.println("            Todays Food            ");
        System.out.println("___________________________________");
        System.out.println("1. Aglio Olio            - RM15");
        System.out.println("2. Marinated Lamb Burger - RM40");
        System.out.println("3. Strawberry Smoothie   - RM17");
        System.out.println("4. Buffalo Chicken Wings - RM25");
       
        System.out.print("\nChoose Your Desired Item(1-4): ");//print choosed item
        productChoice = what.nextInt();//accept user input

        System.out.print("Enter the quantity: ");//print enter choosen item quantity
        productQuan = what.nextInt();//accecpt user input

        switch (productChoice) {//using switch case to choose diifferent item
            case 1:
                itemName = "Aglio Olio";    //item choosed and will be print
                ItemPrice = 15.00f;break;   //item price and will be print 
            case 2:
                itemName = "Marinated Lamb Burger";   //item choosed and will be print     
                ItemPrice = 40.00f;break;             //item price and will be print
            case 3:
                itemName = "Strawberry Smoothie ";    //item choosed and will be print
                ItemPrice = 17.00f;break;             //item price and will be print
            case 4:
                itemName = "Buffalo Chicken Wings ";   //item choosed and will be print 
                ItemPrice = 25.00f;break;              //item price and will be print
                   }

        totalCost = ItemPrice * productQuan; // total item calculation to check the cost

        System.out.println("\nOrder Summary:");
        System.out.println("Product: " + itemName);
        System.out.println("Quantity: " + productQuan);
        System.out.printf("Price per item: RM%.2f\n", ItemPrice); 
        System.out.printf("Total cost: RM%.2f\n", totalCost);
        
      
    }
}


