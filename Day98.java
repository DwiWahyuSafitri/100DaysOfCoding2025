package pkg100dayscoding;

import java.util.Scanner;

public class Day98 {
static void fibonacci(int n){
    int a =0, b=1;
    
    for (int i = 1; i <= n; i++) {
        System.out.println(a +" ");
        int c =a+b;
        a=b;
        b=c;
    }
}    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n: ");
        int n = in.nextInt();
        
        fibonacci(n);
    }
}
