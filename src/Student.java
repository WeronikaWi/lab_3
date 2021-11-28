public class Student extends Osoba {
    protected int numer_indeksu;
    protected KierunekEnum kierunek;
    private boolean czyAktywny;

    //konstruktory
    public Student() {
        super();
        this.numer_indeksu = 000000;
    }

    public Student(int numer_indeksu, KierunekEnum kierunek, boolean czyAktywny) {
        super();
        this.numer_indeksu = numer_indeksu;
        this.kierunek = kierunek;
        this.czyAktywny = czyAktywny;


    }


    public Student(String imie, String nazwisko, int wiek, int numer_indeksu, KierunekEnum kierunek, boolean czyAktywny) {
        super(imie, nazwisko, wiek);
        this.numer_indeksu = numer_indeksu;
        this.kierunek = kierunek;
        this.czyAktywny = czyAktywny;
        if(czyAktywny)
            super.setZawód("student");
    }

    //gettery i settery


    public int getNumer_indeksu() {
        return numer_indeksu;
    }

    public void setNumer_indeksu(int numer_indeksu) {
        this.numer_indeksu = numer_indeksu;
    }

    public KierunekEnum getKierunek() {
        return kierunek;
    }

    public void setKierunek(KierunekEnum kierunek) {
        this.kierunek = kierunek;
    }

    public boolean isCzyAktywny() {
        return czyAktywny;
    }

    public void setCzyAktywny(boolean czyAktywny) {
        this.czyAktywny = czyAktywny;
    }

    @Override
    public String toString() {
        return super.toString() + "\nnumer indeksu: " + numer_indeksu + ", kierunek: " + kierunek + ", status: " + (czyAktywny ? "Aktywny" : "Nieaktywny");
    }
}
