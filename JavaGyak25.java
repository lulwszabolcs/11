import java.util.Scanner;
public class JavaGyak25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
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
        int velszam = (int)(Math.random()*100+1);
        System.out.println(velszam);
        int proba = 0;
        int guess = 0;
        while (velszam != guess) {
            guess = sc.nextInt();
            if (velszam < guess) {
                System.out.println("kisebb");
                proba++;
            } else if (velszam > guess) {
                System.out.println("nagyobb");
                proba++;
            } else {
                System.out.println("probalkozasok: " + proba);
            }
        }
        int macska1 = sc.nextInt();
        int macska2 = sc.nextInt();
        int eger = sc.nextInt();
        if (Math.abs(eger-macska1) > Math.abs(eger-macska2)) {
            System.out.println("2-es macska");
        } else if (Math.abs(eger-macska1) < Math.abs(eger-macska2)) {
            System.out.println("macska 1");
        } else {
            System.out.println("eger");
        }
         */

        int perc = sc.nextInt();
        int nap = 0;
        int ora = 0;
        int oszto = 0;
        if (perc%1440 < 0) {
            nap+=(perc/1440);
            perc-=1440;
            System.out.println(perc);
            if (perc%60 > 0) {
                ora++;
            }
        }
        System.out.println(nap + "nap" + ora + "ora" + perc + "perc");
    }
}
