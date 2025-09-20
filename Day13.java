package EvaluasiMentor;
import java.util.Scanner;
public class Part4 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("masukkan umur");
         int umur = input.nextInt();
         
         System.out.println("masukkan tinggi badan");
         double tinggi= input.nextDouble();
         input.nextLine();

         System.out.println("masukkan nim");
         final String nim= input.nextLine();
         
         System.out.printf("Umur saya : %d",umur );
         System.out.printf("\nTinggi saya : %f", tinggi);
         System.out.printf("\nNim saya : %s", nim);
         
    }
    
}
