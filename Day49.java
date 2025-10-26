package pkg100dayscoding;

import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int a = in.nextInt();
        String hasil =(a %2==0 ) ?"genap" : "ganjil";
        System.out.println("a adalah angka "+hasil);
    } 
}
