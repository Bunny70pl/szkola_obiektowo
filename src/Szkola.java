public class Szkola {
    //singleton tylko jeden obiekt tej klasy dozwolomu
    private static Szkola szkola = new Szkola();
    private String nazwaSzkoly;

    private Szkola() {
        //prywatnt konstruktor jest doste[pny tylko w tej klasie
    }
    public static Szkola getSzkola(){
        return szkola;
    }
}
