package pkg100dayscoding;

import java.util.Scanner;

public class Day35 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan umur: ");
        int umur = in.nextInt();

        if (umur >= 17) {
            System.out.println("Sudah bisa membuat KTP");
        } else {
            System.out.println("Belum bisa membuat KTP");

        }
    }

}
