package pkg100dayscoding;

import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai m : ");
        int m = in.nextInt();
        System.out.print("Masukkan nilai pangkat : ");
        int n = in.nextInt();
        int hasil = 1;
        
        for (int i = 1; i <= n; i++) {
            hasil = hasil* m;
            
        }
        System.out.println("Hasil dari "+ m + " pangkat " + n +" adalah " +hasil);
    }
    
}
