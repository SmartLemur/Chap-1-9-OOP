/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchdemo;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class SwitchDemo {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
       
       System.out.println("Enter Your Month:");
       
       int month = input.nextInt();;
       switch (month){
            case 1: System.out.println("January"); break;
            case 2: System.out.println("February"); break;
            case 3: System.out.println("March"); break;
            case 4: System.out.println("April"); break;
            case 5: System.out.println("May"); break ;
            case 6: System.out.println("June"); break;
            case 7: System.out.println("July"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("September"); break;
            case 10: System.out.println("October"); break ;
            case 11: System.out.println("November"); break ;
            case 12: System.out.println("Dicember"); break ;        
                     
       }
   }    
   
    }
    

