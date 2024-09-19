import java.util.ArrayList;

public class Szkola {
    //singleton tylko jeden obiekt tej klasy dozwolomu
    private static Szkola szkola = new Szkola();
    private String nazwaSzkoly;
    private ArrayList<Uczen> uczniowie = new ArrayList<>();
    private ArrayList<Klasa> klasy = new ArrayList<>();
    private Szkola() {
        //prywatnt konstruktor jest doste[pny tylko w tej klasie
    }
    public static Szkola getSzkola(){
        return szkola;
    }

    public void dodajUczniaDoSzkoly(String imie, String nazwisko){
        Uczen uczen = new Uczen(imie,nazwisko);
        uczniowie.add(uczen);
    }
    public void dodajKlaseDoSzkoly(String nazwa){

        Klasa klasa1a = new Klasa(nazwa);
        klasy.add(klasa1a);
    }
    public void dodajKlaseDoSzkoly(Klasa klasa){
        klasy.add(klasa);
    }

    public void dodajUczniaDoKlasy(Uczen uczen,Klasa klasy){
        klasy.dodajUczniaDoKlasy(uczen);
    }

    @Override
    public String toString() {
        return "Szkola{" +
                "nazwaSzkoly='" + nazwaSzkoly + '\'' +
                ", uczniowie=" + uczniowie +
                ", klasy=" + klasy +
                '}';
    }
}
