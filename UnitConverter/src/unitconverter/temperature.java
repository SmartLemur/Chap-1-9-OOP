/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unitconverter;



/**
 *
 * @author Daniel
 */
// TemperatureConverter.java
public class temperature{
    // used to convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // used to convert Fahrenheit to Celsius
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}

