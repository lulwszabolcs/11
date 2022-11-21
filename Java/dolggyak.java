import java.util.Scanner;

public class dolggyak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float osszeg = 0;
        float[] szamok = new float[10];
        for (int i = 0; i < 10; i++) {
            float vel = (float)(Math.random()*5+1);
            szamok[i] = vel;
        }
        for(float i: szamok) {
            osszeg+=i;
        }
        System.out.println("Atlag: " + osszeg/10);

        String[] szavak = {"asd","kungfu","attila","gyurcsany","kamijon","piperkoc","fasz","xd","kutya","macska"};
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (int)(Math.random()*3+3);j++) {
                System.out.print(szavak[(int)(Math.random()*10)] + " ");
            }
            System.out.println();
        }
        char csere;
        char[] karakterek = new char[5];
        for (int i = 0; i < 5; i++) {
            karakterek[i] = sc.next().charAt(0);
        }
        for(int i=karakterek.length-1;i>=0;i--){
            System.out.println(karakterek[i]);
     }
    }
}
