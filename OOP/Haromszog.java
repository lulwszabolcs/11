public class Haromszog {
        int a, b, c;

    public Haromszog(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Haromszog() {
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }
    public Haromszog(int a) {
        this.a = a;
        this.b = a;
        this.c = a;
    }
    public int kerulet() {
            return a + b + c;
    }
    public double terulet() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }



}

