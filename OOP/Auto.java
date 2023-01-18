public class Auto {
    String marka;
    String tipus;
    int hut;
    public Auto() {
        marka = "Ford";
        tipus = "Focus";
        hut = 1900;
    }
    public Auto(String m, String t, int h) {
        marka = m;
        tipus = t;
        hut = h;
    }
    public void autokiir() {
        System.out.println("Marka:" + marka);
        System.out.println("Tipus:" + tipus);
        System.out.println("Hengerurtartalom:" + hut);
    }
}
