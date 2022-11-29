import java.util.Scanner;

public class ssdfsdf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pozicio1;
        int pozicio2;
        char[][] ticTacToe = {{'-','-','-'},{'-','-','-'},{'-','-','-'}};
        boolean jatekos1 = true;
        do {
            while (jatekos1) {
                pozicio1 = sc.nextInt();
                pozicio2 = sc.nextInt();
                ticTacToe[pozicio1][pozicio2] = 'X';
                for (int i = 0; i < ticTacToe.length; i++) {
                    for (int j = 0; j < ticTacToe[i].length; j++) {
                        System.out.print(" " + ticTacToe[i][j]);
                    }
                    System.out.println();
                }
                jatekos1 = false;
            }
            while (!jatekos1) {
                pozicio1 = sc.nextInt();
                pozicio2 = sc.nextInt();
                ticTacToe[pozicio1][pozicio2] = 'O';
                for (int i = 0; i < ticTacToe.length; i++) {
                    for (int j = 0; j < ticTacToe[i].length; j++) {
                        System.out.print(" " + ticTacToe[i][j]);
                    }
                    System.out.println();
                }
                jatekos1 = true;
            }
        } while ((ticTacToe[0][0] == 'X' & ticTacToe[0][1] == 'X') & ticTacToe[0][2] == 'X');
    }
}
