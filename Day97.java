package pkg100dayscoding;

import java.util.Scanner;

public class Day97 {
 static int LuasPersegi (int sisi){
     return sisi*sisi;
 }     
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        System.out.println(LuasPersegi(s));
    }
}
