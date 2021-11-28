import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 3 klasy */

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */

        Punkt punktA = new Punkt(7);
        System.out.println(punktA);
        punktA = new Punkt(3, 5, 1);
        System.out.println(punktA);
        punktA.setpX(8);
        punktA.setpY(14);
        punktA.setpZ(34);
        System.out.println(punktA);
        System.out.printf("pX = %d\npY = %d\npZ = %d\n\n", punktA.getpX(), punktA.getpY(), punktA.getpZ());
        System.out.printf("Suma = %d\nRóżnica1 = %d\nRóżnica2 = %d\n", punktA.suma(), punktA.roznica(), punktA.roznica(3, 2, 4));


    }
}
