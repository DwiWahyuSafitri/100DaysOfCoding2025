package pkg100dayscoding;

import java.util.Scanner;

public class Day82 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen : ");
        int j = in.nextInt();
        
        int [] genap = new int [j];
        
        System.out.println("Masukkan elemen array ");
        for (int i = 0; i < genap.length; i++) {
            System.out.print("Element ke "+i+" :");
            genap[i]=in.nextInt();
        }
        
        System.out.println("\nIsi arraynya: ");
        for (int i = 0; i < genap.length; i++) {
            System.out.println("genap ["+i+"] = "+genap[i]);
        }
    }
    
}
