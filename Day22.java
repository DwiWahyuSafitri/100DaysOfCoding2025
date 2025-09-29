package pkg100dayscoding;

import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("masukkan nilai sisi persegi");
        int sisi = input.nextInt();
        int luasPersegi= sisi * sisi;
        
        System.out.println("jika sisi nya " + sisi + " maka luas persegi adalah " + luasPersegi);
    }
    
}
