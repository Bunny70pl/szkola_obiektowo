public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Osoba osobaJas = new Osoba("Jas","Rakowski",10);
        System.out.println(osobaJas.getImie());
        System.out.println(osobaJas.getNazwisko());

        osobaJas.setImie("Marus");
        System.out.println(osobaJas.getImie());

        Osoba osobaAla = new Osoba("Ala","Fala");
        System.out.println(osobaJas.getWiek());
        System.out.println(osobaAla.getWiek());

        Osoba osobax = new Osoba();
        System.out.println(osobax.getWiek()+osobax.getImie()+osobax.getNazwisko());

        System.out.println(osobaJas);
        Uczen uczen = new Uczen("Nowak","Nowaczkiewicz");
        System.out.println(Uczen.liczobiektow);
        Uczen uczen1 = new Uczen("Prak","Prorok");
        System.out.println(Uczen.liczobiektow);
        Uczen uczen2 = new Uczen("Mrak","Mowak");
        System.out.println(Uczen.liczobiektow);
        Uczen uczen3 = new Uczen("Orak","Rozaw");
        System.out.println(Uczen.liczobiektow);
        System.out.println(uczen3);
    }
}