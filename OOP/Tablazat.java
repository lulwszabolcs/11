package Tablajatek;

public class Tablazat {
    private int[][] tablazat;

    public Tablazat(int[][] tablazat) {
        this.tablazat = tablazat;
    }
    public Tablazat(int sor, int oszlop) {
        this.tablazat = new int[sor][oszlop];
    }
    // beleir,lekerdez
    public void beleir(int sor, int oszlop, int ertek) {
        tablazat[sor][oszlop] = ertek;
    }
    public int lekerdez(int sor, int oszlop) {
        return tablazat[sor][oszlop];
    }
    public void kirajzol(Tablazat tablazat) {
        for (int i = 0; i < tablazat.length; i++) {
            for (int j = 0; i < tablazat[i].length; i++) {
                System.out.print(tablazat[i][j]);
            }
        }
        System.out.println();
    }
}
