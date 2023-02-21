package tictactoe;

import java.util.Scanner;

public class TicTacToe {
    private char tabla[][];
    Scanner sc;
    int lepesSzam = 0;
    boolean jatekTart = true;
    public TicTacToe() {
        this.tabla = new char[3][3];
        sc = new Scanner(System.in);
    }

    public void kirajzol() {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void bekerEntert() {
        sc.nextLine();
    }

    /*
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
    */
    public void lepes() {
        boolean jatekos1 = true;
        while (jatekos1) {
            int sor = sc.nextInt();
            int oszlop = sc.nextInt();
            while (tabla[sor][oszlop] != '-') {
                System.out.println("Ez a mezo mar foglalt.");
                sor = sc.nextInt();
                oszlop = sc.nextInt();
            }
            tabla[sor][oszlop] = 'X';
            lepesSzam++;
            kirajzol();
            jatekos1 = false;
        }

        while (!jatekos1) {
            // Ha a gep talal olyan helyzetet, amikor az X nyerhet oda tesz egy O-t.
            if ((tabla[0][0] == 'X' && tabla[0][1] == 'X' ||
                    tabla[1][1] == 'X' && tabla[2][0] == 'X' ||
                    tabla[2][2] == 'X' && tabla[1][2] == 'X') && tabla[0][2] == '-'
            ) {
                tabla[0][2] = 'O';
            } else if ((tabla[0][1] == 'X' && tabla[0][2] == 'X' ||
                    tabla[2][0] == 'X' && tabla[1][0] == 'X' ||
                    tabla[1][1] == 'X' && tabla[2][2] == 'X') && tabla[0][0] == '-') {
                tabla[0][0] = 'O';
            } else if ((tabla[2][1] == 'X' && tabla[1][1] == 'X' ||
                    tabla[0][0] == 'X' && tabla[0][2] == 'X') && tabla[0][1] == '-') {
                tabla[0][1] = 'O';
            } else if ((tabla[0][0] == 'X' && tabla[2][0] == 'X' ||
                    tabla[1][1] == 'X' && tabla[1][2] == 'X') && tabla[1][0] == '-') {
                tabla[1][0] = 'O';
            } else if ((tabla[0][1] == 'X' && tabla[2][1] == 'X' ||
                    tabla[1][0] == 'X' && tabla[1][2] == 'X' ||
                    tabla[0][2] == 'X' && tabla[2][0] == 'X') && tabla[1][1] == '-') {
                tabla[2][1] = 'O';
            } else if ((tabla[0][2] == 'X' && tabla[2][2] == 'X' ||
                    tabla[1][0] == 'X' && tabla[1][1] == 'X') && tabla[1][2] == '-') {
                tabla[1][2] = 'O';
            } else if ((tabla[0][0] == 'X' && tabla[1][0] == 'X' ||
                    tabla[2][1] == 'X' && tabla[2][2] == 'X' ||
                    tabla[0][2] == 'X' && tabla[1][1] == 'X') && tabla[2][0] == '-') {
                tabla[2][0] = 'O';
            } else if ((tabla[0][1] == 'X' && tabla[1][1] == 'X' ||
                    tabla[2][0] == 'X' && tabla[2][2] == 'X') && tabla[2][1] == '-') {
                tabla[2][1] = 'O';
            } else if ((tabla[0][2] == 'X' && tabla[1][2] == 'X' ||
                    tabla[2][0] == 'X' && tabla[2][1] == 'X' ||
                    tabla[0][0] == 'X' && tabla[1][1] == 'X') && tabla[2][2] == '-') {
                tabla[2][2] = 'O';
            } else {
                tabla[(int) (Math.random() * 3)][(int) (Math.random() * 3)] = 'O';
            }
            lepesSzam++;
            kirajzol();
            jatekos1 = true;
        }
    }
    public void ellenor() {
        if (lepesSzam >= 9 || (tabla[0][0] != '-' && tabla[0][1] != '-' && tabla[0][2] != '-' &&
                tabla[1][0] != '-' && tabla[1][1] != '-' && tabla[1][2] != '-' &&
                tabla[2][0] != '-' && tabla[2][1] != '-' && tabla[2][2] != '-')) {
            System.out.println("dontetlen" + lepesSzam);
            jatekTart = false;
        }
    }
    public void jatek() {
        tabla = new char[][]{{'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
        while (jatekTart) {
            lepes();
            ellenor();
        }
        ellenor();
    }
}


