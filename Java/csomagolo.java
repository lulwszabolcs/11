public class csomagolo {
    public static void main(String[] args) {
        try {
            char[] tomb = {'a','b','c','d','e'};
            for (int i = 0; i < 6; i++) {
                System.out.println(tomb[i]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // Exception
    }
}
