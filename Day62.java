package pkg100dayscoding;

import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = in.nextInt();
        int total=0;
        
        for (int i = 1; i <= angka; i++) {
            System.out.println(i);
             total += i ;
        }
       
        System.out.println("hasil penjumlahan: " +total);
    }
    
}
