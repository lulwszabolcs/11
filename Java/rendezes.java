public class rendezes {
    public static void main(String[] args) {
        int[] tomb = {177,180,184,164,171,165};
        int csere;
        int min;
        for (int i = 0; i < tomb.length-1; i++) {
            min = i;
            for (int j = i+1; j < tomb.length; j++ ) {
                if (tomb[j] < tomb[min]) {
                    min = j;
                }
            }
            if (min != i) {
                csere = tomb[i];
                tomb[i] = tomb[min];
                tomb[min] = csere;
            }
        }
        for (int szam:tomb) {
            System.out.println(szam);
        }
    }
}
