package pkg100dayscoding;

import java.util.Scanner;

public class Day100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        
        boolean I = false;
        boolean S =false;
        boolean cantik=false;
        
        for (int i = 0; i < a.length(); i++) {
            char b= a.charAt(i);
            
            if (b == 'I') {
                I= true;
            }else if (b == 'S' && I) {
                S=true;
            }else if (b == 'C' && I && S) {
                cantik=true;
                break;
            }
        }
        if (cantik) {
            System.out.println("CANTIK");
        }else{
            System.out.println("TIDAK CANTIK");
        }
    }
    
}
