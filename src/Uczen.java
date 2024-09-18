public class Uczen extends Osoba

//poniewaz uczen am te same wlasnosci co osoba to bedzie klasa potamna klasy osoba
//klasa Osoba bedzie klasa bazowa
{
    private int numerEwidencyjny;
    static int liczobiektow;
    public Uczen(String imie, String nazwisko, int wiek, int numerEwidencyjny) {
        //wywolywanie konstruktora kalsy bazowej
        super(imie, nazwisko, wiek);

        this.numerEwidencyjny = numerEwidencyjny;
        liczobiektow++;
    }

    public Uczen(String imie, String nazwisko) {
        super(imie, nazwisko);
        liczobiektow++;
        numerEwidencyjny = liczobiektow;
    }

    Osoba test = new Osoba();


    @Override
    public String toString() {
        return "Uczen{" +
                "Imie: "+getImie()+" Nazwisko: "+getNazwisko()+" Wiek: "+getWiek()+
                " numerEwidencyjny: " + numerEwidencyjny +
                '}';
    }
}
