public class Nauczyciel extends Osoba{
    private String przedmitot;

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
}
