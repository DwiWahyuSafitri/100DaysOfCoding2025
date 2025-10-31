package pkg100dayscoding;

import java.util.Scanner;

public class Day54 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan angka: ");
        int angka = in.nextInt();
        
        for (int i = 1; i <= angka; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("");
    }
    
}
