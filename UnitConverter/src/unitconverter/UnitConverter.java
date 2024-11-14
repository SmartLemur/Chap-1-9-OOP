/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unitconverter;

/**
 *
 * @author Daniel
 */

// Main.java
import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner mengalah = new Scanner(System.in);
        
        //use to call object
        temperature temp = new temperature ();
        Distance dist = new Distance();
        Length length = new Length();
        int choice;

        do {
            // Display the menu options
            System.out.println("Unit Conversion Menu:");
            System.out.println("__________________________________________");
            System.out.println("| (Temperature)                          |");
            System.out.println("|                                        |");
            System.out.println("| 1. Celsius    (°C) >> Fahrenheit (°F) |");
            System.out.println("| 2. Fahrenheit (°F) >> Celsius    (°C) |");
            System.out.println("|                                        |");
            System.out.println("| (Distance)                             |");
            System.out.println("|                                        |");
            System.out.println("| 3. Meters     (m)  >> Kilometers  (km) |");
            System.out.println("| 4. Kilometers (m)  >> Meters      (m)  |");
            System.out.println("|                                        |");
            System.out.println("| (Length)                               |");
            System.out.println("|                                        |");
            System.out.println("| 5. Centimeters(cm) >> Meters      (m)  |");
            System.out.println("| 6. Meters     (m)  >> Centimeters (cm) |");
            System.out.println("|                                        |");
            System.out.println("|                                        |");
            System.out.println("| (Exit Option)                          |");
            System.out.println("|                                        |");
            System.out.println("| 7. Exit                                |");
            System.out.println("|________________________________________|");
            System.out.println("Choose your option(1-7): ");
           
            choice = mengalah.nextInt();

            switch (choice) {
                case 1:
                    //Celsius >>> Fehrenhetion conversion
                    System.out.print("Enter temperature in Celsius(°C): ");
                    double celsius = mengalah.nextDouble();
                    System.out.println(celsius + " Celsius = " + temp.celsiusToFahrenheit(celsius) + " Fahrenheit(°F)");//print,take input and change the unit
                    break;
                case 2:
                    // Fahrenheit >>> Celsius conversion
                    System.out.print("Enter temperature in Fahrenheit(°F): ");//print
                    double fahrenheit = mengalah.nextDouble();//take input
                    System.out.println(fahrenheit + " Fahrenheit = " + temp.fahrenheitToCelsius(fahrenheit) + " Celsius(°C)");//print,take input and change the unit
                    break;
                case 3:
                    // Meters >>> Kilometers Conversion
                    System.out.print("Enter distance in Meters (m): ");//print
                    double meters = mengalah.nextDouble();//take input
                    System.out.println(meters + " Meters(m) = " + dist.metersToKilometers(meters) + " Kilometers(km)");//print,take input and change the unit
                    break;
                case 4:
                    // Kilometers to Meters Conversion
                    System.out.print("Enter distance in Kilometers(km): ");//print
                    double kilometers = mengalah.nextDouble();//take input
                    System.out.println(kilometers + " Kilometers(km) = " + dist.kilometersToMeters(kilometers) + " Meters(m)");//print,take input and change the unit
                    break;
                case 5:
                    // Centimeters to Meters Conversion
                    System.out.print("Enter length in Centimeters(cm): ");//print
                    double centimeters = mengalah.nextDouble();//take input
                    System.out.println(centimeters + " Centimeters(cm) = " + length.centimetersToMeters(centimeters) + " Meters(m)");//print,take input and change the unit
                    break;
                case 6:
                    // Meters to Centimeters Conversion
                    System.out.print("Enter length in Meters(m): ");//print
                    double lengthMeters = mengalah.nextDouble();//take input
                    System.out.println(lengthMeters + " Meters(m) = " + length.metersToCentimeters(lengthMeters) + " Centimeters(cm)");//print,take input and change the unit
                    break;
                case 7:
                    // Exit the program
                    System.out.println("Exiting the program.");//print
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");//print
            }
        } while (choice != 7);//if choice above num 7 will go to default

        mengalah.close();
    }
}
