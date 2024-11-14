/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package breakexample;

/**
 *
 * @author Daniel
 */
//public class BreakExample {
//    public static void main(String[] args) {
//        System.out.println("Number 1-10");
//        for(int i=1;i<=10;i++){
//            if(i==5)
//                break;//break loop when i is 5
//        System.out.println(i +"\t");}
//         System.out.println("Broke out of loop at i = " +i);}
//}           
//}

public class BreakExample {
    public static void main(String[] args) {
        System.out.println("Number 1-10");
        for (int i = 1; i <= 1000; i++) {
            if (i == 897) {
                break; // break loop when i is 5
            }
            System.out.println(i + "\t");
        }
        System.out.println("Broke out of loop at i = 5");
    }
}
