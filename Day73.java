package pkg100dayscoding;

import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int hasil =0;
        
        while(true){
            System.out.print("Masukkan angka: ");
            int a = in.nextInt();
            
            if (a < 0) {
                break;
            }
            hasil +=a;
        }
        System.out.println("Hasil penjumlahan : "+hasil);
    }
    
}
