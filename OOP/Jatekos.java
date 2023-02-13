package tarsas;

public class Jatekos {
    private String nev;
    private String szin;
    private int pozicio = 0;

    public Jatekos(String nev, String szin) {
        this.nev = nev;
        this.szin = szin;
    }

    public String getNev() {
        return nev;
    }

    public String getSzin() {
        return szin;
    }

    public int getPozicio() {
        return pozicio;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public void setPozicio(int pozicio) {
        this.pozicio = pozicio;
    }
}
