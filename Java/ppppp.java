import java.util.Scanner;

public class ppppp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        int[] tomb = new int[10];
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = (int) (Math.random() * 10 + 1);
            System.out.println(tomb[i]);
        }
        System.out.println("---");
        int i = 0;
        while (i < tomb.length && tomb[i] != 1) {
            i++;
        }
        System.out.println(i<tomb.length ? i : -1);
        // 5 string legutolso amelyikben van a betu
        */

        String[] szavak = new String[5];
        for (int i = 0; i < szavak.length; i++) {
            szavak[i] = sc.next();
        }
        int c = szavak.length-1;
        while (c >= 0 && !szavak[c].contains("a")) {
            c--;
        }
        System.out.println(c < 0 ? -1 : szavak.length-c);
    }
}
