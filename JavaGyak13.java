import java.util.Scanner;
public class JavaGyak13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        String s1 = sc.nextLine(); //enterig
        String s2 = sc.next(); //space ig olvas be
        System.out.println(s1 + " " + s2);

        //1
        String str1 = sc.nextLine();
        char c1 = sc.next().charAt(0);
        System.out.println(String.valueOf(c1).concat(str1));
        //2
        int szam1 = sc.nextInt();
        int szam2 = sc.nextInt();
        System.out.println(String.valueOf(szam1).concat(String.valueOf(szam2)));
        System.out.println(szam1+""+szam2);
        //3 -4
        String str3 = sc.nextLine();
        System.out.println(str3.substring(0,str3.length()/2));
        System.out.println(str3.substring(str3.length()/2));
        //5
        String str4 = sc.nextLine();
        char c2 = sc.next().charAt(0);
        System.out.println(str4.endsWith(String.valueOf(c2)));
        String str5 = " ";
        System.out.println(str5.isBlank());
        System.out.println(str5.isEmpty());
        short s1 = sc.nextShort();
        short s2 = sc.nextShort();
        System.out.println(++s1 + "," + ++s2);
        byte b1 = sc.nextByte();
        byte b2 = sc.nextByte();
        System.out.println(b1 ^ b2);*/
        String szo1 = sc.nextLine();
        char c3 = sc.next().charAt(0);
        System.out.println(szo1.replace(String.valueOf(c3),String.valueOf(c3).toUpperCase()));
    }
}
