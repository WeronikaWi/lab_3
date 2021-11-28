//a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
//        klasa ma się znajdować w osobnym pliku Student.java

public class Student {
    private String imie, nazwisko;
    private int numer_indeksu;
    private boolean czyAktywny;

    public Student() {
    }

    public Student(String imie, String nazwisko, int numer_indeksu, boolean czyAktywny) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer_indeksu = numer_indeksu;
        this.czyAktywny = czyAktywny;
    }

    @Override
    public String toString() {
        String status;
        if (czyAktywny == true)
            status = "Aktywny";
        else
            status = "Nieaktywny";
        return "Imię: " + this.imie + "\nNazwisko: " + this.nazwisko + "\nNumer indeksu: " + numer_indeksu + "\nStatus: " + status + "\n";
    }
}

