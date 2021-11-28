public class Magistrant extends Student{
    private String temat_magisterki;

    //konstruktory

    public Magistrant() {
        super();
        this.temat_magisterki = "";
    }

    public Magistrant(String temat_magisterki) {
        super();
        this.temat_magisterki = temat_magisterki;
    }

    public Magistrant(String imie, String nazwisko, int wiek, int numer_indeksu, KierunekEnum kierunek, String temat_magisterki) {
        super(imie, nazwisko, wiek, numer_indeksu, kierunek, true);
        this.temat_magisterki = temat_magisterki;
    }

    //gettery i settery


    public String getTemat_magisterki() {
        return temat_magisterki;
    }

    public void setTemat_magisterki(String temat_magisterki) {
        this.temat_magisterki = temat_magisterki;
    }

    //metody


    @Override
    public String toString() {
        return super.toString() + "\nTemat magisterki: " + temat_magisterki;
    }
}



