package auto;

import java.util.Scanner;

public class Parkolo {
    private Auto[] parkolo;
    Scanner sc;
    public Parkolo() {
        this.parkolo = new Auto[50];
        sc = new Scanner(System.in);
        for (int i = 0; i < parkolo.length;i++) {
            parkolo[i] = new Auto("-","-");
        }

    }
    public void kiir() {
        for (Auto a : parkolo) {
            System.out.println(a.getRendszam() + "," + a.getTavIdeje());
        }
    }
    public void lekerdez(int hely) {
        if (parkolo[hely].getRendszam() == "-" && parkolo[hely].getTavIdeje() == "-") {
          // System.out.println(parkolo[hely] + "szamu parkolo ures");
            System.out.println("ures");
        } else {
            System.out.println("foglalt");
        }
    }
    public void elhelyez(int hely) {
        for(int i = 0; i < parkolo.length; i++) {
            if (parkolo[hely].getRendszam() == "-" && parkolo[hely].getTavIdeje() == "-") {
                String rendszam = sc.next();
                String tavIdeje = sc.next();
                parkolo[hely].setRendszam(rendszam);
                parkolo[hely].setTavIdeje(tavIdeje);
            }
        }
    }
}
