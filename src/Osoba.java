import java.util.Scanner;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;
    //prywatne wlasonosci sa dostepne tylko w TEJ KLASIE

    //konsturktor to metody wywloywana w moemncie tworzenia obiektu

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
    //przecizaznie to 3 lub wiecej roznych ale tych samych konstruktorow ktore roznia sie tylko wpisywanymi paramterami
    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        wiek = 7;//jezeli nie ma loklanie zmiennej wiek to jest to pole klasy
    }

    public Osoba() {
        imie = "";
        nazwisko = "";
        wiek = 0;
    }

    //Metody dosptepowe settery i gettery
    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setImie(String imie) {
        //wpisywanie hasla z klawiatury
        Scanner klawa = new Scanner(System.in);
        System.out.println("Podaj hasło: ");
        String haslo = klawa.next();
        //jezeli haslo qwe123 to zmien w przeciwnym razie odpowiedni komunikat
        if(haslo.equals("qwe123")){
            this.imie = imie;
        }else{
            System.out.println("Nie masz prawa zmieniac");
        }
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
