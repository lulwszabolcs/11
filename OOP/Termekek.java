public class Termekek {
    private String nev;
    private int egysegAr;
    private int keszlet;

    public Termekek(String nev, int egysegAr, int keszlet) {
        this.nev = nev;
        this.egysegAr = egysegAr;
        this.keszlet = keszlet;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getEgysegAr() {
        return egysegAr;
    }

    public void setEgysegAr(int egysegAr) {
        this.egysegAr = egysegAr;
    }

    public int getKeszlet() {
        return keszlet;
    }

    public void setKeszlet(int keszlet) {
        this.keszlet = keszlet;
    }

    public void kiir() {
        System.out.println("Termék neve: " + nev + " Egységár: " + egysegAr + " Készlet: " + keszlet);
    }
}
