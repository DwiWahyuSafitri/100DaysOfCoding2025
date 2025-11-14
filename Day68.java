package pkg100dayscoding;

import java.util.Scanner;

public class Day68 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        
        for (int i = 1; i <= p; i++) {
            for (int j = 1; j <= p; j++) {
                System.out.print("*");  
               
            }
             System.out.println();
        }
    }
    
}
