public class Szakasz2 {
    private Pont a;
    private Pont b;

    public Szakasz2(Pont a, Pont b) {
        this.a = a;
        this.b = b;
    }


    private double tavolsag(Pont x, Pont y) {
        return Math.sqrt(Math.pow(x.getX() - y.getX(),2) + Math.pow(x.getY()-y.getY(),2));

    }
    public double hossz() {
        return tavolsag(a,b);
    }
    public Pont origogozKozel() {
        Pont origo = new Pont(0,0);
        double tavA = 0;
        double tavB = 0;
        tavA = tavolsag(a,origo);
        tavB = tavolsag(b,origo);
        return tavA < tavB ? a : b;
    }
}
