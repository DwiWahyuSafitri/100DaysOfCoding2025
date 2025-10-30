package pkg100dayscoding;

import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int a = inp.nextInt();
        
        for (int i = 1; i <= a; i++) {
            if (a == 4) {
                break;
            }
            System.out.println(a);
        }
    }
    
}
