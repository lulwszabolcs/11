public class hehelolxd {
    public static void main(String[] args) {
        int[] szamok = {1,3,8,9,4,7,0};
        int max = szamok[0];
        for (int i = 0; i < szamok.length;i++) {
            if (szamok[i] > max) {
                max = szamok[i];
            }
        }
        System.out.println(max);
    }
}
