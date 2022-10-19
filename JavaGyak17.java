import java.util.Scanner;

public class JavaGyak17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        //Szam
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Egy");
                break;
            case 2:
                System.out.println("Ketto");
                break;
            case 3:
                System.out.println("Harom");
                break;
            case 4:
                System.out.println("Negy");
                break;
            default:
                System.out.println("Egyéb");
        }
        byte osztalyzat = sc.nextByte();
        //Jegy
        switch (osztalyzat) {
            case 1:
                System.out.println("Elégtelen");
                break;
            case 2:
                System.out.println("elegseges");
                break;
            case 3:
                System.out.println("kozepes");
                break;
            case 4:
                System.out.println("jo");
                break;
            case 5:
                System.out.println("jeles");
                break;
            default:
                System.out.println("Nem adtal meg jot");
            }
         */
        //kocka
        int bro = (int)Math.floor(Math.random()*6+1);
        switch (bro) {
            case 1:
                System.out.println(bro + " Egyes");
                break;
            case 2:
                System.out.println(bro + " Kettes");
                break;
            case 3:
                System.out.println(bro + " Harmas");
                break;
            case 4:
                System.out.println(bro + " Negyes");
                break;
            case 5:
                System.out.println(bro + " Otos");
                break;
            case 6:
                System.out.println(bro + " Hatos");
            }
        byte b5 = sc.nextByte();
        if (b5 < 0) {
            System.out.println("Negativ");
        } else if (b5 == 0) {
            System.out.println("0");
        } else {
            System.out.println("Pozitiv");
        }
        byte b7 = sc.nextByte();
        switch (b7) {
            case 1:
                System.out.println("Egy");
                break;
            case 2:
                System.out.println("Ketto");
                break;
            case 3:
                System.out.println("Harom");
                break;
            case 4:
                System.out.println("Negy");
                break;
            case 5:
                System.out.println("Ot");
                break;
            case 6:
                System.out.println("Hat");
                break;
            case 7:
                System.out.println("Het");
                break;
            case 8:
                System.out.println("Nyolc");
                break;
            case 9:
                System.out.println("Kilenc");
                break;
            case 10:
                System.out.println("Tiz");
                break;
            default:
                System.out.println("Nem jo");
                break;

        }
        }
    }

