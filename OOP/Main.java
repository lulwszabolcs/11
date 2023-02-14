package Tablajatek;

public class Main {
    public static void main(String[] args) {
        Tablazat t1 = new Tablazat(5,5);
        t1.beleir(3,3,5);
        System.out.println(t1.lekerdez(3,3));
        System.out.println(t1.kirajzol(t1));
    }
}
