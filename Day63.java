package pkg100dayscoding;

import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int k =1;
        
        for (int i = 1; i <= n ; i++) {
            System.out.println(i);
            k *= i;
        }
        System.out.println("Hasill perkalian 1-n : "+ k);
    }
    
}
