import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */
        List<Osoba> osoby = new ArrayList<>();
        Osoba osoba = new Osoba("Ala", "Nowak", 12, "programista");
        osoby.add(osoba);
        osoba = new Student();
        osoby.add(osoba);
        osoba = new Student(123456, KierunekEnum.INFORMATYKA,true);
        osoby.add(osoba);
        osoba = new Student("Ola", "Nowak", 34, 123456, KierunekEnum.ROBOTYKA, true);
        osoby.add(osoba);
        osoba = new Magistrant("Ala", "Kowalczyk", 25, 321456, KierunekEnum.PEDAGOGIKA, "Wpływ książek na edukację");
        osoby.add(osoba);
        osoba = new Student("Max", "Nowak", 23, 134564, KierunekEnum.PSYCHOLOGIA, false);
        osoby.add(osoba);


        System.out.println(osoby);


    }
}
