import java.util.Scanner;

public class JavaGyak11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int a = sc.nextInt();
        System.out.println(a*2);
        byte b = sc.nextByte();
        System.out.println(b);
        float c = sc.nextFloat();
        System.out.println(c/3);
        double d = sc.nextDouble();
        System.out.println(d/3);
        char c = sc.next().charAt(0);
        System.out.println(c);
        //String s = sc.nextLine();
        //String s2 = sc.nextLine();
        //System.out.println(s.contains("a"));
        //System.out.println(s.concat(""+s2));
        String k = sc.nextLine();
        System.out.println(k.endsWith(s.substring(0,1)));
        int szam1 = sc.nextInt();
        int szam2 = sc.nextInt();
        System.out.println(szam1+szam2);*/
        int szam1 = sc.nextInt();
        System.out.println(szam1 % 2 == 0 ? "paros" : "paratlan");
    }
}
