package tictactoe;

import java.util.Scanner;

public class TicTacToe {
    private char tabla[][];
    Scanner sc;

    public TicTacToe() {
        this.tabla = new char[3][3];
        sc = new Scanner(System.in);
    }
    public void kirajzol() {
        for (int i  = 0;i < tabla.length;i++) {
            for (int j = 0; j < tabla[i].length;j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }
    private void bekerEntert(){
        sc.nextLine();
    }
    private void jatekosValtas() {
        boolean jatekos1 = true;
        boolean jatekos2 = false;
        int vel = (int)(Math.random()*1);
        if (vel == 0) {
            jatekos1 = true;
            jatekos2 = false;
        } else {
            jatekos1 = false;
            jatekos2 = true;
        }
    }
    public void lepes() {
        int sor = sc.nextInt();
        int oszlop = sc.nextInt();
        tabla[sor][oszlop] = 'X';
    }

    public void jatek() {
        tabla = new char[][]{{'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
        lepes();
        //bekerEntert();
        kirajzol();
    }
}
