package tarsas;

import java.util.Scanner;

public class Jatek {
    private Jatekos[] jatekosok;

    public void init() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hany jatekosunk lesz? ");
        int jatekosokSzama = sc.nextInt();
        jatekosok = new Jatekos[jatekosokSzama];
        for (int i = 0; i < jatekosokSzama; i++) {
            System.out.println("Nev: ");
            String nev = sc.next();
            System.out.println("Szin: ");
            String szin = sc.next();
            jatekosok[i] = new Jatekos(nev,szin);
        }
    }
    public void printJatekosok() {
        for (Jatekos j: jatekosok) {
            System.out.println(j.getNev() + "," + j.getSzin() + "," + j.getPozicio());
        }
    }
}
