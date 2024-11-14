/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forloop;

/**
 *
 * @author Daniel
 */
//public class ForLoop {
//
//    public static void main(String[] args) {
//        for(int i = 1;i<=5;i++){
//            System.out.print(i);
//        
//          System.out.println();
//       }  
//    }
//}

  public class ForLoop {  
//public static void main(String[] args) {  
//for(int i=1;i<=10;i++){  
//for(int j=1;j<=i;j++){  
//        System.out.print("* ");  
//}  
//System.out.println();//new line  
//}  
//}  
//}  
  
//public static void main(String[] args) {  
//     
//for(int k=1;k<=10;k++){  
//for(int l=1;l<=k;l++){  
//        System.out.print("* ");  
//}      
//for(int p=1;p<=10;p++){  
//for(int l=1;l<=p;l++){  
//        System.out.print("* ");  
//}     
// 
//
// 
//System.out.println();//new line  
//}}}}

//    public static void main(String[] args) {
//        int n = 5; // height of the diamond
//
//        // Top half of the diamond
//        for (int i = 1; i <= n; i++) {
//            for (int j = i; j < n; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= (2 * i - 1); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        // Bottom half of the diamond
//       for (int i = 1; i <= n; i++) {
//            for (int j = i; j < n; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= (2 * i - 1); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//            System.out.println();
//        }
//    
//    }


    public static void main(String[] args) {
        int n = 6; 

        int numberOfTriangles = 2;

       
        for (int t = 1; t <= numberOfTriangles; t++) {
            for (int i = 1; i <= n; i++) {
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("+");
                }
                System.out.println();
            }
        }

        for (int i = -1; i <= n / 2; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print(" ");
            }
            System.out.println("O");
        }
    }
}

