import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */
        Student student1 = new Student("Marek", "Kowalski", 123456, true);
        Student student2 = new Student("Ola", "Nowak", 43256, false);
        Student student3 = new Student("Alex", "Król", 53827, true);

        Student[] studenci = {student1, student2, student3};


        for (Student student : studenci) {
            System.out.println(student);
        }
    }
}
