package osztalyok;

public class Osztaly {
    private Tanulo[] tanulok;

    public Osztaly(Tanulo[] tanulok) {
        this.tanulok = tanulok;
    }

    public Tanulo[] getTanulok() {
        return tanulok;
    }
    public void printTanulok() {
        for (Tanulo t: tanulok) {
            System.out.println(t.getNev() + "," + t.getOsztaly());
        }
    }
}
