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
    }
}