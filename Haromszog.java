public class Haromszog {
    int ax, ay;
    int bx, by;
    int cx, cy;
    public Haromszog(int a, int b, int c, int d, int e, int f) {
        ax = a;
        ay = b;
        bx = c;
        by = d;
        cx = e;
        cy = f;
    }
    public double tavolsag(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
    }
    public double oldA() {
        return tavolsag(ax,ay,bx,by);
    }
    public double oldB() {
        return tavolsag(cx,cy,bx,by);
    }
    public double oldC() {
        return tavolsag(ax,ay,cx,cy);
    }
    public double csucsTavolsag(int x1,int x2) {
        return tavolsag(0,0,ax,ay);
    }
    public double csucstavA() {
        return csucsTavolsag(ax,ay);
    }
    public double csucstavB() {
        return csucsTavolsag(bx,by);
    }
    public double csucstavC() {
        return csucsTavolsag(cx,cy);
    }
    public double kerulet() {
        return oldA()+oldB()+oldC();
    }
    public double terulet() {
        double s = kerulet()/2;
        return Math.sqrt(s*(s-oldA())*(s-oldB())*(s-oldC()));
    }
}
