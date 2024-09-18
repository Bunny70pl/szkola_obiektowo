public sealed class Nauczyciel extends Osoba implements Dyzurny permits Wychowawca{
    private String przedmitot;
    //seald ograczione dziedziceznie
    //do czego moze
    public Nauczyciel(String imie, String nazwisko, int wiek, String przedmitot) {
        super(imie, nazwisko, wiek);
        this.przedmitot = przedmitot;
    }

    @Override
    public String toString() {
        return "Nauczyciel{" +
                " Imie: "+getImie()+" Nazwisko: "+getNazwisko()+ " Wiek: "+getWiek()+
                "przedmitot:" + przedmitot  +
                '}';
    }

    @Override
    public void wykonajDyzur() {
        System.out.println("Spacedr po korytarzu");
    }
}
