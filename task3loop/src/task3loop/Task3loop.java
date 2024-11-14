/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task3loop;

/**
 *
 * @author Daniel
 */
public class Task3loop {
    public static void main(String[] args) {
        int even = 0;// ambil kosong supaya kita punya sum of even akan jadi 30+0=30
        int odd = 0;//ambil kosong supaya kita punya sum of odd akan jadi 25+0=25

        
        System.out.println("Even numbers 1-10: ");//Print text even number
        for (int i = 1; i <= 10; i++) { //loop untuk even number which bermula dari num 1
            if (i % 2 == 0) { //untuk check if number kita tu even atau tak
                even += i;// Untuk tambah semua even numbers kita
                System.out.print(i + " ");//untuk display semua even numbers kita
            }
        }
        System.out.println("\nSum of even numbers: " + even);// print text even number pastu letak hasil tambah semua even number kita
        
        System.out.println("\nOdd numbers 1-10: ");//untuk print odd number
        for (int i = 1; i <= 10; i++) {//loop untuk odd number which bermula dari num 1
            if (i % 2 != 0) { //untuk check number kita tu odd atau tak
                odd += i;//untuk tambah semua odd number kits
                System.out.print(i + " ");//untuk disply semua odd number kita
            }
        }
        System.out.println("\nSum of odd numbers: " + odd);//print "Sum of odd number" and letak hasil tambah semua odd number
    }
}