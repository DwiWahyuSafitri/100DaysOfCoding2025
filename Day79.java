package pkg100dayscoding;

import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
       
        System.out.println("__Sign Up__");
        System.out.print("Create Username: ");
        String user = in.nextLine();
        System.out.print("Create Password: ");
        String pass = in.nextLine();
        
        System.out.println("\nAccount Create Successsfully!");
        
        while(true){
            System.out.println("\n__Sign In__");
            System.out.print("Username: ");
            String u = in.nextLine();
            System.out.print("Password: ");
            String p = in.nextLine();
            
            if (u.equals(user) && p.equals(pass)) {
                System.out.println("Sign in Success");
                System.out.println("WELCOMEE!!");
                break;
            }else{
                System.out.println("Sign in fail");
                System.out.println("Try Again!");
            }
        }
    }
}
