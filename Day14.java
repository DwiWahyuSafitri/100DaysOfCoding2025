package pkg100dayscoding;
public class Day14 {
    public static void main(String[] args) {
        
        String umur = "18";
        String berat = "49.6";
        
        /*Method parse digunakan untuk mengubah data bertipe String menjadi 
        tipe data primitif agar bisa diproses dalam program*/
        int tahun = Integer.parseInt(umur);
        double kg = Double.parseDouble(berat);
        System.out.println(tahun);
        System.out.println(kg);
    }
}
