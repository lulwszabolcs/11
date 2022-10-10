import java.util.Scanner;

public class JavaGyak12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*String s1 = sc.nextLine();
        //System.out.println(s1.length() % 2 == 0 ? s1.substring(s1.length()/2-1,s1.length()/2+1) : s1.substring(s1.length()/2-1,s1.length()/2+2)));
        String s2 = sc.nextLine();
        System.out.println(s2.contains("a") ? s2.substring(s2.indexOf("a"),s2.indexOf("a")+2) : "Nem talalhato");
        String s3 = "   ";
        System.out.println(s3.isBlank());
        System.out.println(s3.isEmpty()); */
        short sh1 = sc.nextShort();
        short sh2 = sc.nextShort();
        System.out.println(++sh1 + "," + ++sh2);
        byte b1 = sc.nextByte();
        byte b2 = sc.nextByte();
        System.out.println(b1 ^ b2);
        String szo1 = sc.nextLine();
        char c1 = sc.next().charAt(0);
        System.out.println(szo1.replace());
    }
}
