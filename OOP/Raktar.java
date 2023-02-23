import java.util.Scanner;

public class Raktar {
    private Termekek[] termekek;
    Scanner sc;
    public Raktar(int termekDb) {
        termekek = new Termekek[termekDb];
        sc = new Scanner(System.in);
        for (int i = 0; i < termekDb; i++) {
            termekek[i] = ujTermek();
        }
    }
    private Termekek ujTermek() {
        System.out.println("Nev: ");
        String nev = sc.next();
        System.out.println("Egysegar: ");
        int egysegAr = sc.nextInt();
        System.out.println("Keszlet: ");
        int keszlet = sc.nextInt();
        Termekek t1 = new Termekek(nev,egysegAr,keszlet);
        return t1;
    }
    public void kiir() {
        for (Termekek i: termekek) {
            i.kiir();
        }
    }
    public int osszErtek() {
        int osszeg = 0;
        for (Termekek term: termekek) {
            osszeg+=term.getKeszlet() * term.getEgysegAr();
        }
        return osszeg;
    }
    public int osszKeszlet() {
        int osszKeszl = 0;
        for (Termekek term: termekek) {
            osszKeszl += term.getKeszlet();
        }
        return osszKeszl;
    }
}
