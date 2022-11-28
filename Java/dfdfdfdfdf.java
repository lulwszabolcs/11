public class dfdfdfdfdf {
    public static void main(String[] args) {
        /*
        int[][] ketD = {{1,2,3}, {4,5,6}, {7,8,9}};
        for (int i = 0; i < ketD.length; i++) {
            for (int j = 0; j < ketD[i].length; j++) {
                System.out.print(ketD[i][j]);
            }
            System.out.println("");
        }

        int[][] ketD2 = new int[8][8];
        for (int i = 0; i < ketD2.length; i++) {
            for (int j = 0; j < ketD2[i].length; j++) {
                ketD2[6][6] = 1;
                ketD2[7][7] = -1;
                System.out.print(" " + ketD2[i][j]);
            }
            System.out.println("");
        }

         */
        char[][] tictactoe = new char[3][3];
        for (int i = 0; i < tictactoe.length; i++) {
            for (int j = 0; j < tictactoe[i].length; j++) {
                tictactoe[i][j] = '-';
                System.out.print(" "+tictactoe[i][j]);
            }
            System.out.println();
        }

        char[][] ketD3 = {{'a','b','c'},{'a','b','c','d'},{'a','b','c','d','e'}};
        for (int i = 0; i < ketD3.length; i++) {
            for (int j = 0; j < ketD3[i].length; j++) {
                System.out.print(" "+ketD3[i][j]);
            }
            System.out.println();
        }
    }
}