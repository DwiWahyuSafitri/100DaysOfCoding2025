package pkg100dayscoding;

import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int angka = in.nextInt();
        
        if (angka %2==0) {
            System.out.println("ini adalah angka genap");
        }else{
            System.out.println("Ini adalah angka ganjil");
            
        }
    }
    
}
