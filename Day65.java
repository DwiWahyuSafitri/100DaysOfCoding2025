package pkg100dayscoding;

import java.util.Scanner;

public class Day65 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angka = in.nextInt();
        int f = 1;
        
        for (int i = angka; i >= 1; i--) {
            f = f * i;
        }
        System.out.println(angka + "! = "+ f);
    }
    
}
