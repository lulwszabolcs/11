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
        System.out.println();
    }

    private void bekerEntert() {
        sc.nextLine();
    }

    public void lepes() {
        boolean jatekos1 = true;
        int vel = (int)(Math.random()*2+1);
        while (lepesSzam == 1) {
            if (vel == 2) {
                jatekos1 = false;
            }
        }
        while (jatekos1) {
            System.out.println("X jatekos lep:");
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
            System.out.println("O jatekos lep:");
            if (((tabla[0][0] == 'X' && tabla[0][1] == 'X' ||
                    tabla[1][1] == 'X' && tabla[2][0] == 'X' ||
                    tabla[2][2] == 'X' && tabla[1][2] == 'X')) && tabla[0][2] == '-'
            ) {
                tabla[0][2] = 'O';
            } else if (((tabla[0][1] == 'X' && tabla[0][2] == 'X' ||
                    tabla[2][0] == 'X' && tabla[1][0] == 'X' ||
                    tabla[1][1] == 'X' && tabla[2][2] == 'X')) && tabla[0][0] == '-') {
                tabla[0][0] = 'O';
            } else if (((tabla[2][1] == 'X' && tabla[1][1] == 'X' ||
                    tabla[0][0] == 'X' && tabla[0][2] == 'X')) && tabla[0][1] == '-') {
                tabla[0][1] = 'O';
            } else if (((tabla[0][0] == 'X' && tabla[2][0] == 'X' ||
                    tabla[1][1] == 'X' && tabla[1][2] == 'X')) && tabla[1][0] == '-') {
                tabla[1][0] = 'O';
            } else if (((tabla[0][1] == 'X' && tabla[2][1] == 'X' ||
                    tabla[1][0] == 'X' && tabla[1][2] == 'X' ||
                    tabla[0][2] == 'X' && tabla[2][0] == 'X')) && tabla[1][1] == '-') {
                tabla[2][1] = 'O';
            } else if (((tabla[0][2] == 'X' && tabla[2][2] == 'X' ||
                    tabla[1][0] == 'X' && tabla[1][1] == 'X')) && tabla[1][2] == '-') {
                tabla[1][2] = 'O';
            } else if (((tabla[0][0] == 'X' && tabla[1][0] == 'X' ||
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
        if ((tabla[0][0] == 'X' && tabla[0][1] == 'X' && tabla[0][2] == 'X') ||
                (tabla[1][0] == 'X' && tabla[1][1] == 'X' && tabla[1][2] == 'X') ||
                (tabla[2][0] == 'X' && tabla[2][1] == 'X' && tabla[2][2] == 'X') ||
                (tabla[0][1] == 'X' && tabla[1][1] == 'X' && tabla[2][1] == 'X') ||
                (tabla[0][0] == 'X' && tabla[1][0] == 'X' && tabla[2][0] == 'X') ||
                (tabla[0][2] == 'X' && tabla[1][2] == 'X' && tabla[2][2] == 'X') ||
                (tabla[0][0] == 'X' && tabla[1][1] == 'X' && tabla[2][2] == 'X') ||
                (tabla[0][2] == 'X' && tabla[1][1] == 'X' && tabla[2][0] == 'X')) {
            jatekTart = false;
            System.out.println("X jatekos nyert"); }
        if ((tabla[0][0] == 'O' && tabla[0][1] == 'O' && tabla[0][2] == 'O') ||
                (tabla[1][0] == 'O' && tabla[1][1] == 'O' && tabla[1][2] == 'O') ||
                ((tabla[2][0] == 'O' && tabla[2][1] == 'O' && tabla[2][2] == 'O')) ||
                ((tabla[0][1] == 'O' && tabla[1][1] == 'O' && tabla[2][1] == 'O')) ||
                ((tabla[0][0] == 'O' && tabla[1][0] == 'O' && tabla[2][0] == 'O')) ||
                (tabla[0][2] == 'O' && tabla[1][2] == 'O' && tabla[2][2] == 'O') ||
                (tabla[0][0] == 'O' && tabla[1][1] == 'O' && tabla[2][2] == 'O') ||
                (tabla[0][2] == 'O' && tabla[1][1] == 'O' && tabla[2][0] == 'O')
        ) {
            jatekTart = false;
            System.out.println("O jatekos (gep) nyert");
        }
        if (lepesSzam == 9 ^ (tabla[0][0] != '-' && tabla[0][1] != '-' && tabla[0][2] != '-' &&
                tabla[1][0] != '-' && tabla[1][1] != '-' && tabla[1][2] != '-' &&
                tabla[2][0] != '-' && tabla[2][1] != '-' && tabla[2][2] != '-') && jatekTart) {
            System.out.println("Dontetlen");
            jatekTart = false;
        }
    }
    public void jatek() {
        tabla = new char[][]{{'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
        while (jatekTart) {
            lepes();
            ellenor();
        }
    }
}