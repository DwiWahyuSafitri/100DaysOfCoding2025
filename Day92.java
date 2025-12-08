package pkg100dayscoding;

public class Day92 {
 static int cariLuas (int l,int p){
     return p*l;
 }

 static int Keliling (int l,int p){
     return 2*(p+l);
 }
    public static void main(String[] args) {
        int hasilLuas = cariLuas(4,6);
        int hasilKeliling= Keliling(4,6);
        System.out.println("Luas persegi panjang adalah :  "+hasilLuas);
        System.out.println("Keliling persegi panjang adalah :  "+hasilKeliling);
    }
}
