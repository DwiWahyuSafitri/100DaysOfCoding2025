package pkg100dayscoding;

import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = in.nextInt();
        System.out.print("Masukkan kelipatan: ");
        int m = in.nextInt();
        
        System.out.println("nilai kelipatan "+m +" dari angka 1 sampai "+n +" adalah ");
        
        for (int i = 1; i <= n; i++) {
            if (i %m == 0) {
                System.out.println(i);
            }
        }
    }
    
}
