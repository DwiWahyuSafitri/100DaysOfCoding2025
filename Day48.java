package pkg100dayscoding;

import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka pertama : ");
        double a = in.nextDouble();
        System.out.print("Operator yang digunakan(+ - * / ) : ");
        char op = in.next().charAt(0);
        System.out.print("Masukkan angka kedua : ");
        double b = in.nextDouble();
        double hasil = 0;

        switch (op) {
            case '+':
                hasil = a + b;
                break;
            case '-':
                hasil = a - b;
                break;
            case '*':
                hasil = a * b;
                break;
            case '/':
                hasil = a / b;
                break;
          
            default:
                System.out.println("Operator tidak valid");

        }
        System.out.println("Hasil : " + hasil);
    }
    
}
