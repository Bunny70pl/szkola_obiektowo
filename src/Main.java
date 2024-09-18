public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Osoba osobaJas = new Osoba("Jas","Rakowski",7);

        // nie zgodne z regula heremtyzacji
        System.out.println(osobaJas.imie);
        System.out.println(osobaJas.nazwisko);
        System.out.println(osobaJas.wiek);

        osobaJas.imie = "janek";
        System.out.println(osobaJas.imie);
        //hermetyzacja
        //powinno byc tak zeby program glowny nie mogl zmieniac wlasnosci klas
    }
}