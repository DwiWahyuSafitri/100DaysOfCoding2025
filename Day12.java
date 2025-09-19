package pkg100dayscoding;

import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("masukkan nama");
        String nama = input.nextLine();
        
        System.out.println("masukkan tanggal lahir");
        String ttl = input.nextLine();
        
        System.out.println("masukkan alamat");
        String alamat = input.nextLine();
       
        System.out.println("masukkan umur");
        byte umur = input.nextByte();
        
        System.out.println("masukkan tinggi badan");
        double tinggi = input.nextDouble();
        
        System.out.println("masukkan berat badan");
        double berat = input.nextDouble();
       
        System.out.println("nama saya adalah "+nama);
        System.out.println("tanggal lahir saya "+ttl);
        System.out.println("alamat saya di "+alamat);
        System.out.println("saya berumur "+umur);
        System.out.println("tinggi badan saya "+tinggi );
        System.out.println("berat badan saya "+berat);
        
    }
}
