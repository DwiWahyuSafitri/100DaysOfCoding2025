package pkg100dayscoding;

import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("masikkan jari jari lingkaran");
        int JariJari = input.nextInt();
        double pi = 3.14;
        double luas = pi * (JariJari * JariJari);
        
        System.out.println("Luas Lingkaran adalah "+ luas);
        
    }
    
}
