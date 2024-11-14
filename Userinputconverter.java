/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package userinputconverter;

/**
 *
 * @author Daniel
 */
//import java.util.Scanner;
//public class Userinputconverter {
//
//   
//    public static void main(String[] args) {
//        int converter,amount;
//        
//        String currency,mass,distance;
//                
//        Scanner buat = new Scanner(System.in);
//        
//        System.out.print("Converter Available: "); 
//        System.out.println("1. Currency (MYR - YEN");
//        System.out.println("2. Mass (kg - pound");
//        System.out.println("3. Distance (km - m");
//       
//        System.out.print("Choose your Converter: ");
//        converter = buat.nextInt(); 
//        
//        System.out.print("Insert Amount/Quantity: ");
//        amount = buat.nextInt();
//        
//       
//         switch (converter) {//using switch case to choose diifferent item
//            case 1:
//                currency = "Currency";    //item choosed and will be print
//                break;   //item price and will be print 
//            case 2:
//                mass= "Mass";   //item choosed and will be print     
//                break;             //item price and will be print
//            case 3:
//                distance = "Distance ";    //item choosed and will be print
//                break;             //item price and will be print
//                   }
//         
//        System.out.println("what.nextInt() " + currency);
//        System.out.println("what.nextInt() " + mass);
//        System.out.printf("what.nextInt()", distance); 
//        
//        
//      
//    }
//    
//}

import java.util.Scanner;

public class Userinputconverter {

    public static void main(String[] args) {
        int converter, amount;

        Scanner buat = new Scanner(System.in);

        System.out.println("Converter Available:");
        System.out.println("1. Currency (MYR to YEN)");
        System.out.println("2. Mass (kg to pound)");
        System.out.println("3. Distance (km to m)");

        System.out.print("Choose your Converter : ");
        converter = buat.nextInt();



        switch (converter) { // using switch case to choose different item
            case 1:
                System.out.print("Insert Amount/Quantity: RM ");
                amount = buat.nextInt();
                double yen = amount * 32.3588; // Example conversion rate
                System.out.println(amount + " RM =  " + yen + " JPY");
                break;
            case 2:
                System.out.print("Insert The Mass(kg): ");
                amount = buat.nextInt();
                double pounds = amount * 2.205; // Example conversion rate
                System.out.println(amount + " kg is " + pounds + " pounds");
                break;
            case 3:
                System.out.print("Insert The Distance(km):  ");
                amount = buat.nextInt();
                int meters = amount * 1000; // Example conversion rate
                System.out.println(amount + " km is " + meters + " meters");
                break;
            default:
                System.out.println("Invalid converter option.");
        }
    }
}

