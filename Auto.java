package auto;

public class Auto {
    private String rendszam;
    private String tavIdeje;

    public Auto(String rendszam, String tavIdeje) {
        this.rendszam = rendszam;
        this.tavIdeje = tavIdeje;
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public String getTavIdeje() {
        return tavIdeje;
    }

    public void setTavIdeje(String tavIdeje) {
        this.tavIdeje = tavIdeje;
    }
    public void kiir() {
        System.out.println(rendszam + "," + tavIdeje);
    }
}
