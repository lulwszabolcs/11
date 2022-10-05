import java.util.Locale;
public class StringGyak {
    public static void main(String[] args) {
        String nev = "NagySzabolcs";
        System.out.println(nev.contains("i"));
        System.out.println(!nev.isBlank());
        System.out.println("Hello" + " " + nev);
        System.out.println("Hello ".concat(nev));
        System.out.println(nev.endsWith("id") || nev.endsWith("or"));
        String nagy = nev.toUpperCase();
        System.out.println(nagy.charAt(nagy.length()-2));
        System.out.println(nev.replace("A", "Aa"));
        System.out.println(nev.charAt((nev.length()-1)/2));
        System.out.println(nev.contains("d") ? "talalhato" : "nem talalhato");
        System.out.println(nev.toLowerCase().charAt((nev.length()-1)/3));
        System.out.println(nev.charAt(nev.lastIndexOf("a")+1));
        System.out.println(nev.charAt(nev.indexOf("a")+1));

    }
}
