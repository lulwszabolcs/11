import java.util.Scanner;
public class JavaGyak22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        //1
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println(d1-Math.floor(d1) > d2-Math.floor(d2) ? d1 : d2);

        //2
        char c1 = sc.next().charAt(0);
        if (c1 >= 97) {
            System.out.println(String.valueOf(c1).toUpperCase());
        } else {
            System.out.println(String.valueOf(c1).toLowerCase());
        }

        //3
        int hom = sc.nextInt();
        if (hom < 0) {
            System.out.println("fagyas");
        } else if (hom < 100) {
            System.out.println("sima");
        } else {
            System.out.println("forras");
        }

        //4
        int evszam = sc.nextInt();
        switch (evszam) {
            case 0-476 -> System.out.println("okor");
            case 477-1640 -> System.out.println("kozep");
            case 1641-1917 -> System.out.println("ujkor");
            default -> System.out.println("xd");
        }

        //5
        int n1 = 1, n2 = 1, n3 = 0,i;
        System.out.println(n1 + " " + n2);
        for (i = 2;i < 10;++i){
            n3 = n1+n1;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
        }

        int szam1 = sc.nextInt();
        int szam2 = sc.nextInt();
        if (szam1 < szam2) {
            for (;szam1<=szam2;szam1+=2) {
                System.out.println(szam1);
            }
        } else {
            for (;szam2<=szam1;szam2+=2) {
                System.out.println(szam2);
            }
        }
        */
        //7
        int vel1 = (int)(Math.random()*10+1);
        int vel2 = (int)(Math.random()*10+1);
        do {
            vel1 = (int)(Math.random()*10+1);
            vel2 = (int)(Math.random()*10+1);
            System.out.println(vel1 + " " + vel2);
        } while (vel1 != vel2);
    }
}
