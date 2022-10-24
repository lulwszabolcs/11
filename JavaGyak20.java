import java.util.Scanner;

public class JavaGyak20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Számok kiíratása 1-10-ig elöl és hátultesztelősen
        int szam = 1;
        while (szam <= 10) {
            System.out.println(szam);
            szam++;
        }

        szam = 1;
        do {
            System.out.println(szam);
            szam++;
        }
        while (szam <=10);

        //Számok bekérése 0 végjelig, összegük
        int osszeg = 0;
        int kutya;
        do {
            kutya = sc.nextInt();
            osszeg+=kutya;
        }
        while (kutya != 0);
        System.out.println(osszeg);

        // Véletlen számok 1-10-ig amíg az összegük kisebb mint 100
        int vel;
        int na = 0;
        do {
            vel = (int)(Math.floor(Math.random()*10));
            na += vel;
            System.out.println(vel);
        }
        while (na < 100);

        // Véletlen számok amíg 10 nem lesz
        System.out.println("----------");
        int vel2;
        do {
            vel2 = (int)(Math.random()*10+1);
            System.out.println(vel2);
        }
        while (vel2 != 10);

        // Karakterek x végjelig, szó kíírása karakterekből
        char c = sc.next().charAt(0);
        String s = "";
        while (c != 'x') {
            s+=c;
            c = sc.next().charAt(0);
        }
        System.out.println(s);
    }
}
