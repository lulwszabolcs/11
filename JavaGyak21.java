import java.util.Scanner;
public class JavaGyak21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        //1
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a % 2 != 0 || b % 2 != 0) {
            System.out.println("Van benne");
        } else {
            System.out.println("Nincs benne");
        }

        //2
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        System.out.println(c1 < c2 ? c1 : c2);

        //3
        int pont = sc.nextInt();
        if (pont < 29) {
            System.out.println("Egyes");
        } else if (pont < 49) {
            System.out.println("Kettes");
        } else if (pont < 69) {
            System.out.println("Harmas");
        } else if (pont < 89) {
            System.out.println("Negyes");
        } else {
            System.out.println("Otos");
        }

        //4
        int ora = sc.nextInt();
        switch (ora) {
            case 0, 1, 2, 3, 22, 23, 24 -> System.out.println("Ejszaka");
            case 4, 5, 6 -> System.out.println("Hajnal");
            case 7, 8, 9 -> System.out.println("Reggel");
            case 10, 11 -> System.out.println("Delelott");
            case 12 -> System.out.println("Del");
            case 13, 14, 15, 16 -> System.out.println("Delutan");
            case 17, 18, 19, 20, 21 -> System.out.println("Este");
            default -> System.out.println("Nem jot adtal meg");
        }
*/
        //5
        int db = 0;
        for (int i = 1; i <= 10;i++) {
            System.out.println(i*3);
        }

        //6
        int szam1 = sc.nextInt();
        int szam2 = sc.nextInt();
        while (szam1 <= szam2) {
            System.out.println(szam1);
            szam1+=2;
        }

        //7
        int velszam = (int)(Math.random()*10+1);
        int guess = sc.nextInt();
        while (velszam != guess) {
            guess = sc.nextInt();
        }
    }
}
