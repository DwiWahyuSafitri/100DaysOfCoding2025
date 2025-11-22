package pkg100dayscoding;

public class Day76 {
    public static void main(String[] args) {
        String a ="Betul";
        String b ="Betul";
        String c ="BetUL";
        String d ="Besok libur";
        String e = "";
        
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(c));
        System.out.println(d.contains("libur"));
        System.out.println(d.contains("Libur"));
        System.out.println(e.isEmpty());
    }
    
}
