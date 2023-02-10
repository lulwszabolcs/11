package csapatok;
public class Csapat {
    private Jatekos[] jatekosok;

    public Csapat(Jatekos[] jatekosok) {
        this.jatekosok = jatekosok;
    }

    public Jatekos[] getJatekosok() {
        return jatekosok;
    }

    public void printJatekosok() {
        for (Jatekos j: jatekosok) {
            System.out.println(j.getNev() + "," + j.getSzam());
        }
    }
}
