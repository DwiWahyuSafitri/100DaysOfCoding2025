package pkg100dayscoding;

import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("==MENU MINUMAN==");
        System.out.println("1.kopi hitam");
        System.out.println("2.es teh");
        System.out.println("3.es jeruk");
        System.out.println("4.air mineral");
        System.out.print("pilih pesanan(1-4): ");
        int pilihan = in.nextInt();
        int harga=0;
        
        String menu = null;
        switch(pilihan){
            case 1:
                menu ="kopi hitam";
                harga = 8000;
                break;
            case 2:
                menu ="es teh";
                harga = 5000;
                break;
            case 3:
                menu ="es jeruk";
                harga = 7000;
                break;
            case 4:
                menu ="air mineral";
                harga = 4000;
                break;
            default:
                menu ="menu tidak tersedia";
                break;
        }
        
        System.out.println("\n===Struk pembelian===");
        System.out.println("Pesanan          : "+menu);
        System.out.println("Total pembayaran : "+harga);
    }
    
}
