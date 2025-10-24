package pkg100dayscoding;

import java.util.Scanner;

public class Day47 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan kode hari(1-7): ");
        int kode = in.nextInt();
        
        switch(kode){ 
            case 1:
                System.out.println("senin");
                break;
            case 2:
                System.out.println("selasa");
                break;
            case 3:
                System.out.println("rabu");
                break;
            case 4:
                System.out.println("kamis");
                break;
            case 5:
                System.out.println("jumat");
                break;
            case 6:
                System.out.println("sabtu");
                break;
            case 7:
                System.out.println("minggu");
                break;
            default:
                System.out.println("kode tidak terbaca");
                break;
        }
    }
    
}
