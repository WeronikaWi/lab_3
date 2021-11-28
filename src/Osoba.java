public class Osoba {

    protected String imie, nazwisko;
    protected int wiek;
    private String zawód;

    //konstruktory


    public Osoba() {
        this.imie = "";
        this.nazwisko = "";
        this.wiek = 0;
        this.zawód = "brak";
    }

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Osoba(String imie, String nazwisko, int wiek, String zawód) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.zawód = zawód;
    }

    //gettery i settery
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getZawód() {
        return zawód;
    }

    public void setZawód(String zawód) {
        this.zawód = zawód;
    }

    //metody
    public int rokUrodzenia() {
        return 2021 - this.wiek;
    }

    @Override
    public String toString() {
        return "\nOsoba\nimie: " + imie + ", nazwisko: " + nazwisko + ", wiek: " + wiek + ", zawód: " + zawód;
    }
}
