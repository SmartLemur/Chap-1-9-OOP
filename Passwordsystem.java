/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passwordsystem;
import java.util.Scanner;

public class Passwordsystem {
    public static void main(String[] args) {
        String betulpass = "elkumar"; //ni password saya
        int attemptmax = 3;//Kita letak 3 sebaab nak limitkan password yg user kasi
        int attempts = 0;

        Scanner elhitung = new Scanner(System.in);

        while (attempts < attemptmax) { //ini untuk condition attempt kita which tkle lebih 3 kali
            System.out.print("Enter your password: ");//print Enter your password:
            String password = elhitung.nextLine();// ini untuk input yg dimasukkan oleh user which password dh fix iaitu elkumar

            if (password.equals(betulpass)) {// no apa yg saya faham dia mcm formula untuk coding jenis ada password
                System.out.println("Yey password anda betul! Access granted.");//akan "print Yey password anda betul! Access granted."
                break;
            } else {
                System.out.println("Buu password anda salah. Please try again.");//akan print "Buu password anda salah. Please try again." 
                attempts++;// ini untuk tambah please try again which tak boleh leboh 3 ikut condition kat atas
            }
        }

        if (attempts >= attemptmax) { //ini untuk menunjukkan kalau number of attempt dh melebihi 3 kali akn keluar ayat baru
            System.out.println("Banyak sangat password salah!!!. Access denied.");// akan print "Banyak sangat password salah!!!. Access denied."
        }

        elhitung.close();
    }
}
