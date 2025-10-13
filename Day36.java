package pkg100dayscoding;

import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan umur : ");
        int umur = in.nextInt();
        System.out.print("Apakah sudah punya KTP(true/false): ");
        boolean PunyaKTP = in.nextBoolean();
        
        if (umur >= 17 ) {
            if (PunyaKTP) {
                System.out.println("Sudah bisa membuat rekening");
            }else{
                System.out.println("Sudah cukup umur,Buat KTP dulu");
                
            }
        }else{
            System.out.println("Belum bisa membuat rekening ");
        }
    }
    
}
