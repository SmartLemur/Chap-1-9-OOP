/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package continuedemo;

/**
 *
 * @author Daniel
 */
//public class ContinueDemo {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        String searchMe = "peter piper picked a peck of pickled peppers";
//        int max = searchMe.lenght(); 
//        int numPs = 0;
//        for (int i = 0; i <max; i++){
//            if(searchMe.charAt(i)!='p')
//                continue; }
//            numPs++;}
//            System.out.println("Found"+ numPs +" p's in the string.");
//                    {}}
//    
//    
//public class ContinueDemo {
//    public static void main(String[] args) {
//        String searchMe ="She sells seashells by the seashore";
//        int max = searchMe.length(); 
//        int numss = 0;
//        int numes = 0;
//        
//        for (int i = 0; i < max; i++) {
//            if (searchMe.charAt(i) != 's')
//                continue; 
//            numss++;
//            
//             System.out.println("Found " + numss + " s's in the string.");
////            System.out.println(max);
//        }
//         for (int k = 0; k < max; k++) {
//            if (searchMe.charAt(k) != 'e')
//                continue; 
//            numes++;
//  
//        System.out.println("Found " + numes + " e's in the string.");
//    }
//}}

public class ContinueDemo {
    public static void main(String[] args) {
        String searchMe = "She sells seashells by the seashore";
        int max = searchMe.length();
        int numSs = 0;
        int numEs = 0;

        
        for (int i = 0; i < max; i++) {  // Count the number of 's' characters
            if (searchMe.charAt(i) != 's') {
                continue;
            }
            numSs++;
        }
        System.out.println("Found " + numSs + " 's' characters in the string.");

 
        for (int i = 0; i < max; i++) { // Count the number of 'e' characters
            if (searchMe.charAt(i) != 'e') {
                continue;
            }
            numEs++;
        }
        System.out.println("Found " + numEs + " 'e' characters in the string.");
    }
}
