package pkg100dayscoding;

import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan kode warna : ");
        int kode = in.nextInt();
        
        switch (kode){
            case 1 :
                System.out.println("biru");
                break;
            case 2:
                System.out.println("merah");
                break;
            case 3 :
                System.out.println("kuning");
                break;
            case 4:
                System.out.println("hijau");
                break;
                
            default:
                System.out.println("kode warna tidak diketahui");
                break;
        }
    }
    
}
