package pkg100dayscoding;

import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = in.nextInt();
        
        if (nilai >= 90 && nilai <= 100) {
            System.out.println("Predikat nilai A");
        }else if (nilai >= 80 && nilai <=89) {
            System.out.println("Predikat nilai B");
        }else if (nilai >= 70 && nilai <= 79) {
            System.out.println("Predikat nilai C");
        }else if (nilai >= 60 && nilai <= 69) {
            System.out.println("Predikat nilai D");
        }else{
            System.out.println("Predikat nilai E");
         
        }
    }
    
}
