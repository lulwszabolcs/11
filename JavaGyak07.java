public class JavaGyak07 {
    public static void main(String[] args) {
        //füzet
        //típúsok + operátorok + referencia
        /*
        String s = "valami";
        System.out.println(s);
        String s2 = "valami";
        s2 = new String("ez is valami");
        System.out.println(s2);
        System.out.println(s2.length());
        */
        String szoveg = "Imádom az informatikát";
        String szoveg2;
        szoveg2 = new String(",az aaf-et is");
        System.out.println(szoveg);
        System.out.println(szoveg2);
        System.out.println(szoveg.concat(szoveg2));
        System.out.println(szoveg.length());
        System.out.println(szoveg.toUpperCase());
    }
}

