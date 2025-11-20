package pkg100dayscoding;

import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pesan=0;
        
        do{
            System.out.println("=====MENU=====");
            System.out.println("1.Nasi Goreng");
            System.out.println("2.Nasi Kuning");
            System.out.println("3.Ayam Geprek");
            System.out.println("4.Mie ayam");
            System.out.println("5.Bakso");
            System.out.println("6.Keluar");
            System.out.print("Pilih menu : ");
            pesan=in.nextInt();
            
            switch(pesan){
                case 1 :
                    System.out.println("Pesanan anda nasi goreng");
                    break;
                case 2 :
                    System.out.println("Pesanan anda nasi kuning");
                    break;
                case 3 :
                    System.out.println("Pesanan anda ayam geprek");
                    break;
                case 4 :
                    System.out.println("Pesanan anda Mie ayam");
                    break;
                case 5 :
                    System.out.println("Pesanan anda bakso");
                    break;
                case 6 :
                    System.out.println("Anda keluar dari menu");
                    break;
                default :
                    System.out.println("Pesanan anda tidak terbaca");
                    break;
            }
              }while(pesan != 6);
       
         }
      }
