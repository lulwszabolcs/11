public class HaromszogPonttal {
    private Pont a,b,c;

    public HaromszogPonttal(Pont a, Pont b, Pont c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    private double tavolsag(Pont x, Pont y) {
        return Math.sqrt(Math.pow(x.getX() - y.getX(),2) + Math.pow(x.getY()-y.getY(),2));
    }
    public double tavOrigotolA() {
        Pont origo = new Pont(0,0);
        return tavolsag(a,origo);
    }
    public double tavOrigotolB() {
        Pont origo = new Pont(0,0);
        return tavolsag(b,origo);

    }
    public double tavOrigotolC() {
        Pont origo = new Pont(0,0);
        return tavolsag(c,origo);
    }
    public double aHossz() {
        return tavolsag(a,b);
    }
    public double bHossz() {
        return tavolsag(b,c);
    }
    public double cHossz() {
        return tavolsag(a,c);
    }
}
