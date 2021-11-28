/* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

public class Student {
    private Osoba osoba;
    private WydzialEnum wydzial;

    public Student(String imie, String nazwisko, int numer_indeksu, WydzialEnum wydzial) {
        this.osoba = new Osoba(imie, nazwisko, numer_indeksu);
        this.wydzial = wydzial;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }

    public WydzialEnum getWydzial() {
        return wydzial;
    }

    public void setWydzial(WydzialEnum wydzial) {
        this.wydzial = wydzial;
    }

    @Override
    public String toString() {
        return "Student\n" +
                 osoba +
                "\nWydzial: " + wydzial + "\n\n";
    }
}
