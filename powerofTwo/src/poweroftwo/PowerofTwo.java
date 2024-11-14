/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poweroftwo;

/**
 *
 * @author Daniel
 */
public class PowerofTwo {

    public static void main(String[] args) {
        int tambah = 0;

        for (int i = 1; i <= 10; i++) { //loop untuk kita punya program which bermula dair num 1 and dia akan repeat sampai num 10
            int p2 = i * i; //formula untuk jadikan numbers dari loop kita didarabkan
            tambah += p2; //Untuk sum up semua hasil power of 2 kita
            System.out.println(i + "^2 = " + p2); // kasi dia print ^2 sebelah kita punya loop dari 1-10 pastu letak kita punya jwpn power of 2 bagi setiap number
        }

        System.out.println("Sum of pow(2): " + tambah);// untuk print Sum of pow(2):
    }
}