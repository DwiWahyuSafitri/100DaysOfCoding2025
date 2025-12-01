package pkg100dayscoding;

import java.util.Scanner;

public class Day85 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlah = in.nextInt();
        
        int [] a = new int[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            a[i] = in.nextInt();
        }
        int max = a[0];
        for (int i = 0; i < jumlah; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Angka tertinggi : "+max);
    }
    
}
