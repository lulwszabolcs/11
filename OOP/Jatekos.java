package csapatok;
public class Jatekos {
    private String nev;
    private int szam;

    public Jatekos(String nev, int szam) {
        this.nev = nev;
        this.szam = szam;
    }

     String getNev() {
        return nev;
    }

     int getSzam() {
        return szam;
    }
}
