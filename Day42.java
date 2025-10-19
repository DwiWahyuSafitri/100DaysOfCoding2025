package pkg100dayscoding;

import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        System.out.print("Masukkan gaji: ");
        int gaji = in.nextInt();
        System.out.print("Masukkan tunjangan: ");
        int tunjangan = in.nextInt();
        int gajiKotor = gaji+tunjangan;
        int pajak;
        
        if (gajiKotor >= 10000000) {
            pajak =gajiKotor * 8/100;
        }else if (gajiKotor >= 5000000) {
            pajak =gajiKotor * 5/100;
        }else{
            pajak =gajiKotor * 2/100;
        }
           int gajiBersih = gajiKotor - pajak;
           
           System.out.println("===SLIP GAJI===");
           System.out.println("Gaji        : "+gaji);
           System.out.println("Tunjangan   : "+tunjangan);
           System.out.println("Pajak       : "+pajak);
           System.out.println("Gaji bersih : "+gajiBersih);
    
    }
    
}
