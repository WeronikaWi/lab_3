import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */
        List<Student> studentList = new ArrayList<>();

        Student student = new Student("Marek", "Kowalski", 123456, WydzialEnum.INFORMATYKI);
        studentList.add(student);
        student = new Student("Olga", "Nowak", 634156, WydzialEnum.ZARZĄDZANIA);
        studentList.add(student);
        student = new Student("Olaf", "Kowal", 645656, WydzialEnum.PSYCHOLOGII);
        studentList.add(student);
        student = new Student("Anna", "Król", 345676, WydzialEnum.INFORMATYKI);
        studentList.add(student);
        student = new Student("Alex", "Miller", 567846, WydzialEnum.ADMINISTRACJI);
        studentList.add(student);

        for (Student s: studentList) {
            System.out.println(s);
        }

    }
}
/* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */