package pkg100dayscoding;

import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = inp.nextInt();
        String gg = (angka % 2 == 0) ? "genap" : "ganjil";
        
        System.out.println("Angka tersebut adalah bilangan : "+gg);
        
    }
    
}
