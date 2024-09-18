public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Osoba osobaJas = new Osoba("Jas","Rakowski",7);
        System.out.println(osobaJas.getImie());
        System.out.println(osobaJas.getNazwisko());

        osobaJas.setImie("Marus");
        System.out.println(osobaJas.getImie());
    }
}