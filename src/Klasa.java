import java.util.ArrayList;

public class Klasa {
    private String nazwaKlasy;
    private ArrayList<Uczen> uczniowie;
    private Nauczyciel wychowawca;

    public Klasa(String nazwaKlasy) {
        this.nazwaKlasy = nazwaKlasy;
        uczniowie = new ArrayList<>();
    }

    public Klasa(String nazwaKlasy, Nauczyciel wychowawca) {
        this.nazwaKlasy = nazwaKlasy;
        this.wychowawca = wychowawca;
        uczniowie = new ArrayList<>();
    }

    public void dodajUczniaDoKlasy(Uczen uczen){
        if(!uczniowie.contains(uczen)){
            uczniowie.add(uczen);
        }else{
            System.out.println("Jest juz taki uczen w klasie");
        }
    }

    @Override
    public String toString() {
        return "Klasa: " +
                " nazwaKlasy: '" + nazwaKlasy + '\'' +
                ", wychowawca: " + wychowawca+
                ", uczniowie: " + uczniowie;
    }
}
