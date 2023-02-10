package osztalyok;

public class Tanulo {
    private String nev;
    private int osztaly;

    public Tanulo(String nev, int osztaly) {
        this.nev = nev;
        this.osztaly = osztaly;
    }

    public String getNev() {
        return nev;
    }

    public int getOsztaly() {
        return osztaly;
    }
}
