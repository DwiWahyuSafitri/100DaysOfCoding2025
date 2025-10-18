package pkg100dayscoding;

import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double panjang = in.nextDouble();
        double lebar = in.nextDouble();
        double hasil = panjang * lebar;  
        
        System.out.printf("Luas taman yang akan ditanami rumput adalah %.2f meter persegi ", hasil);
    }
    
}
