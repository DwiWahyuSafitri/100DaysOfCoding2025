package pkg100dayscoding;

public class Day96 {
 static int tambah(int a,int b){
     return a+b;
 }    
  static int kurang(int a,int b){
      return a-b;
  }
   static int kali(int a,int b){
      return a*b;
  }
    static int bagi(int a,int b){
      return a/b;
  }
    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        
        System.out.println("Penjumlahan : "+tambah(n,m));
        System.out.println("Pengurangan : "+kurang(n,m));
        System.out.println("Perkalian   : "+kali(n,m));
        System.out.println("Pembagian   : "+bagi(n,m));
    }
}
