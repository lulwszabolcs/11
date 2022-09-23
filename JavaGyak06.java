public class JavaGyak06 {
    public static void main(String[] args) {
        int a = 3, b = 4;
        /*
        System.out.println(a == 5 && b++ == 4);
        System.out.println(b);
        System.out.println(a == 7 || b++ == 4);
        System.out.println(b);
        System.out.println(++b < a-2 && b++ == 5);
        System.out.println(b + " " + a);
        System.out.println(++a * (++b & (a - 3))); // az a értéke nő !
        System.out.println((a ^ b) * (a | b));*/
        System.out.println(b++ * (++b & (a-3)) < 8 && a++%2 == 1);
        System.out.println(a + " " + b);
    }
}
