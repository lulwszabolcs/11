public class OOP {
    public static void main(String[] args) {
        Tanulok t1 = new Tanulok();
        t1.nev = "Hurkecz Attila";
        t1.osztondij = 5000;
        t1.kiir();
        Auto a1 = new Auto("BMW","X5",2005);
        Auto a2 = new Auto("Volkswagen","Golf",2006);
        a2.autokiir();
        Auto a3 = new Auto();
        a3.autokiir();
    }
}
