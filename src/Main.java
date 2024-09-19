public class Main {
    public static void main(String[] args) {

        Uczen uczen = new Uczen("Nowak","Nowaczkiewicz");
        System.out.println(Uczen.liczobiektow);
        Uczen uczen1 = new Uczen("Prak","Prorok");
        System.out.println(Uczen.liczobiektow);
        Uczen uczen2 = new Uczen("Mrak","Mowak");
        System.out.println(Uczen.liczobiektow);
        Uczen uczen3 = new Uczen("Orak","Rozaw");
        System.out.println(Uczen.liczobiektow);
        System.out.println(uczen3);

        Nauczyciel nauczycielSlowik =new Nauczyciel("Marek","Sojekj",25,"Matma");
        System.out.println(nauczycielSlowik);
        nauczycielSlowik.wykonajDyzur();
        uczen.wykonajDyzur();

        Klasa klasa1a = new Klasa("1a", nauczycielSlowik);
        klasa1a.dodajUczniaDoKlasy(uczen);
        klasa1a.dodajUczniaDoKlasy(uczen2);
        klasa1a.dodajUczniaDoKlasy(uczen3);
        System.out.println(klasa1a);
    }
}