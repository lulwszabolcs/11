import java.util.Scanner;

public class elso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        int[] tomb = new int[5];
        for (int i = 0;i<5;i++) {
            tomb[i] = sc.nextInt();
        }
        for (int i = 0;i<tomb.length;i++) {
            if (tomb[i] % 2 == 0) {
                System.out.println(tomb[i]);
            }
        }
        int[] tomb2 = new int[5];
        for (int i = 0;i<tomb.length;i++) {
            tomb2[i] = (int)(Math.random() * 5 + 1);
        }
        int bekert = sc.nextInt();
        boolean benne = false;
        for (int i:tomb2) {
            if (bekert == i) {
                benne = true;
                break;
            }
        }
        if (benne) {
            System.out.println("benne");
        } else {
            System.out.println("nincs");
        }
        float[] tomb3 = new float[10];
        float osszeg = 0f;
        int db = 0;
        for (int i = 0;i<tomb3.length;i++) {
            float vel = (float)(Math.random()*5+1);
            tomb3[i] = vel;
            osszeg += tomb3[i];
            db++;
        }
        System.out.println("Atlag: " + osszeg/db);

        String[] tomb4 = new String[5];
        for (int i = 0; i < 5; i++) {
            tomb4[i] = sc.next();
        }
        String leghosszabb = new String("");
        for (int i = 0; i < tomb4.length; i++) {
            if (tomb4[i].length() > leghosszabb.length() && tomb4[i].contains("a")) {
                leghosszabb = tomb4[i];
            }
        }
        System.out.println(leghosszabb);
        */

        int[] tomb = new int[10];
        for (int i = 0; i< tomb.length;i++) {
            int velet = (int)(Math.random()*10+1);
            tomb[i] = velet;
        }
        int legnagyobb = 0;
        for (int i = 0; i< tomb.length;i++) {
            if (tomb[i] > legnagyobb) {
                legnagyobb = tomb[i];
            }
            System.out.println(tomb[i]);
        }
        int db = 0;
        for (int i = 0;i<tomb.length;i++) {
            if (tomb[i] == legnagyobb) {
                db++;
            }
        }
        System.out.println(db);
    }
}
