package pkg100dayscoding;

import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("masukkan panjang persegi panjang");
        int panjang = input.nextInt();
        System.out.println("masukkan lebar persegi panjang");
        int lebar = input.nextInt();
        int luas = panjang*lebar;
        
        System.out.println("Luas persegi panjang tersebut adalah "+ luas);
    }
    
}
