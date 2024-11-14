/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kismark;

/**
 *
 * @author Daniel
 */
import java.util.Scanner;
public class KisMark {
     public static void main(String[] args) {
   Scanner input = new Scanner(System.in);       
        
   System.out.println("Late number: ");
        int latenumber = input.nextInt();
       input.nextInt();
        float deductmarks =(float) 0.3;
     
        float totalKISmark = 0;   
        
        if(latenumber> 3) {
         totalKISmark = latenumber*deductmarks;
        }
    System.out.println("Total KIS Marks:"+ totalKISmark);
        
        } 
    }

