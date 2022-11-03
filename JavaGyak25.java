import java.util.Scanner;
public class JavaGyak25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            if (i == 3 || i == 7) continue;
            System.out.println(i);
        }
        int szam = sc.nextInt();
        int i = 2;
        boolean prim = true;
        while (prim && i <= Math.sqrt(szam)) {
            if (szam % i == 0) {
                prim = false;
            }
            i++;
        }
        System.out.println(prim);
    }
}
