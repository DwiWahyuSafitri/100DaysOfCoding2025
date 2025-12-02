package pkg100dayscoding;

import java.util.Scanner;

public class Day86 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        
        int [] nilai = new int[p];
        
        for (int i = 0; i < p; i++) {
            nilai[i]=in.nextInt();
        }
        int min = nilai[0];
        
        for (int i = 0; i < p; i++) {
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }
        System.out.println("Nilai minimum:  "+min);
    }
    
}
