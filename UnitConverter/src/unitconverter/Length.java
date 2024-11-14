/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unitconverter;

/**
 *
 * @author Daniel
 */
// LengthConverter.java
public class Length {
    // used to convert Centimeters to Meters
    public double centimetersToMeters(double centimeters) {
        return centimeters / 100;
    }

    // used to onvert Meters to Centimeters
    public double metersToCentimeters(double meters) {
        return meters * 100;
    }
}

