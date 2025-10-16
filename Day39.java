package pkg100dayscoding;

import java.util.Scanner;

public class Day39 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("==Peran sebagai===");
        System.out.println("1.Admin");
        System.out.println("2.Kasir");
        System.out.println("3.Pelanggan");
        System.out.print("Masukkan kode peran : ");
        int peran = in.nextInt();

        if (peran == 1) {
            System.out.println("==Menu admin==");
            System.out.println("1.Tambah data ");
            System.out.println("2.Hapus data ");
            System.out.println("3.Lihat laporan ");
        } else if (peran == 2) {
            System.out.println("==Menu kasir==");
            System.out.println("1.Input Transaksi");
            System.out.println("2.Cetak struk");
        } else if (peran == 3) {
            System.out.println("==Pelanggan==");
            System.out.println("1.Lihat produk");
            System.out.println("2.Beli produk");
        }else{
            System.out.println("kode peran tidak terbaca");
        }
    }

}
