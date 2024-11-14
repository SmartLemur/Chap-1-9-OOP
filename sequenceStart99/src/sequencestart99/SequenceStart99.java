/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sequencestart99;

/**
 *
 * @author Daniel
 */
public class SequenceStart99 {

    public static void main(String[] args) {
          System.out.println("Ini sequence menurun dari num 99 hingga 11 kita:");// untuk print "Ini sequence menurun dari num 99 hingga 11 kita:" 
        for (int i = 99; i >= 11; i -= 11) { //untuk condition dia supaya start dari num 99 and berakhir pada num 11.Note that i -= 11 tu maksud dia -dari number sebelumnya
           
            System.out.print(i + " ");// untuk show semua kita punya integers
           
        }
    }
}