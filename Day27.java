package pkg100dayscoding;

import java.util.Scanner;


public class Day27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan nilai a");
        int a = input.nextInt();
        System.out.println("masukkan nilai b");
        int b = input.nextInt();

        System.out.println("sebelum: " + a + " " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("sesudah: " + a + " " + b);

    }
    
}
