package pkg100dayscoding;

import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.print("Masukkan pesan: ");
        String pesan = in.nextLine();
        
        String r = pesan.trim();
        
        System.out.println("Pesan rapih : "+r);
        System.out.println("panjang pesan : "+r.length());
        System.out.println("Uppercase : "+r.toUpperCase());
        System.out.println("Mengandung 'senang'? "+ r.contains("senang"));
        
        if (r.length() >=3) {
            System.out.println("3 huruf pertama: "+ r.substring(0,3));
        }
    }
    
}
