package pkg100dayscoding;

import java.util.Scanner;

public class Day34 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = in.nextInt();

        boolean hasil = (angka % 3 == 0 && angka % 5 == 0);
        
        System.out.println("Apakah angka habis dibagi 3 dan 5 ? " + hasil);

    }

}
