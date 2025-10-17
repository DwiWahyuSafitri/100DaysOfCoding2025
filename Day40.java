package pkg100dayscoding;

import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan angka pertama : ");
        double a = in.nextDouble();
        System.out.print("Operator ( + - * / ) : ");
        char operator = in.next().charAt(0);
        System.out.print("Masukkan angka kedua : ");
        double b =in.nextDouble();
        
        if (operator == '+') {
            System.out.println(a + b);
        }else if (operator == '-') {
            System.out.println(a - b);
        }else if (operator == '*') {
            System.out.println(a * b);
        }else if (operator == '/') {
            System.out.println(a / b);
        }else{
            System.out.println("Operator tidak bisa");
       
        }
    }
    
}
