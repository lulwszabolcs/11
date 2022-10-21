import java.util.Scanner;

public class JavaGyak19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        for (int i = 0; i < 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
        int osszeg = 0;
        for (int i = 0;i<5;i++) {
            int a = sc.nextInt();
            osszeg += a;
        }
        System.out.println(osszeg);


        int legnagyobb = 0;
        for (int i = 0; i < 5; i++) {
            int vel = (int)(Math.random()*20+1);
            System.out.println(vel);
            if (vel > legnagyobb) {
                legnagyobb = vel;
            }
            System.out.println("Legnagyobb: " + legnagyobb);
         */
        int szam = sc.nextInt();
        int valt = 1;
        for (int i = 1; i <= szam; i++) {
            valt *= i;
        }
            System.out.println(valt);

        int min = Integer.MAX_VALUE;
        for (; ;) {
            int i1 = sc.nextInt();
            if (i1 == 0) {
                break;
            }
            if (i1 < min) {
                min = i1;
            }

        }
        System.out.println(min);



        }
    }

