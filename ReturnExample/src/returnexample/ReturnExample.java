/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package returnexample;

/**
 * 
 * 
 * 
 *
 * @author Daniel
 */
//public class ReturnExample {
//
//    public static void main(String[] args) {
//        int result;
//        for(int i = 1; i<=10; i++){
//            result = square(i);
//            System.out.println("The square of" +i"is =" +result+"\n");}}
//    public static int square(int y){
//        return y*y;
//        }
//    }
    
public class ReturnExample {

    public static void main(String[] args) {
        int result;
        for(int i = 1; i <= 189; i++) {
            result = square(i);
            System.out.println("The square of " + i + " is = " + result + "\n");
        }
    }

    public static int square(int y) {
        return y * y;
    }
}
