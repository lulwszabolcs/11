package javagyak04;
public class JavaGyak04 {
    public static void main(String[] args) {
        int a = 8, b = 3;
        System.out.println(a*b + " " + a+b);
        System.out.println(a >> b); //bitenkénti eltolás jobbra
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a & b); //bitenkénti ÉS
        System.out.println(a | b); //bitenkénti VAGY
        System.out.println(a ^ b); //bitenkénti kizáró VAGY
        System.out.println(a > b && b > 1); //logikai ÉS
        System.out.println(a > b || b > 1); //logikai VAGY          
    }
    
}
