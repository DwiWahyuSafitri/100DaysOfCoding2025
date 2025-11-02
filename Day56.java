package pkg100dayscoding;

import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
         int n=0;
         
         do{
             System.out.print("Masukkan nilai: ");
             n = in.nextInt();
             System.out.println("Ketentuan (nilai >= 75)"); 
       
         }while(n <= 75);
         System.out.println("Nilai cukup");            
    }
    
}
