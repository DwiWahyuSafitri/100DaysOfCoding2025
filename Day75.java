package pkg100dayscoding;

import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan kalimat : ");
        String k = in.nextLine();
        
        System.out.println("================");
        System.out.println("Lenght    : "+ k.length());
        System.out.println("UpperCase : "+ k.toUpperCase());
        System.out.println("LowerCase : "+k.toLowerCase());
    }
    
}
