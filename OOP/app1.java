public class app1 {
    public static void main(String[] args) {
        Haromszog h1 = new Haromszog(3, 4, 5);
        System.out.println("k: " + h1.kerulet());
        System.out.println("t: " + h1.terulet());
        Haromszog h2 = new Haromszog(10,12,5);
        System.out.println("k: " + h2.kerulet());
        Haromszog hh = new Haromszog(11);
        System.out.println("k: " + hh.kerulet());
        System.out.println("t: " + hh.terulet());

    }
}
