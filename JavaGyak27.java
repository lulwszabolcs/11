public class JavaGyak27 {
    public static void main(String[] args) {
        byte[] tomb = new byte[10];
        //System.out.println(tomb[9]);
        //tomb[5] = 7;
        //System.out.println(tomb[5]);
        for (int i = 0;i<=9;i++){
            tomb[i] = (byte)(i*3);
        }
        System.out.println(tomb[4]);
    }
}
