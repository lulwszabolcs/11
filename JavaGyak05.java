public class JavaGyak05 {
    public static void main(String[] args) {
        /*
        int i = 5;
        double d = 1;
        System.out.println(i/2*d);
        System.out.println(d/i/2);

        byte b = 1; int i = 3;
        boolean ok = (b+2*i++) % 2 == 0 || i == 4;
        System.out.println(ok);

        short s = 32; char c = ' ';
        int i = c/s;
        System.out.println((int)c);
        */
        int a = 4, b = 3;
        System.out.println(a*++a+b < b--*8);
        System.out.println(--b*8);
    }
}
