import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 1 enum-y */

        /* zad.1
        a) Stworzyć prosty enum "LiczbyEnum" z liczbami od 1 do 6 zapisanymi słownie,
        b) stworzyć prosty enum "StatusEnum" z wartościami KONTYNUUJEMY i KONIEC,
        c) stworzyć pętlę while z wartością true w warunku (nieskończona pętla),
        d) niech w pętli są podawane wartości liczbowe z klawiatury,
        e) jeśli użytkownik poda z klawiatury 0 to program ma kończyć działanie,
        f) umieścić w pętli switch() case: które będą wypisywały cyfry słownie odpowiednio
        do podanych cyfr przez użytkownika,
        g) gdy użytkownik wciśnie 0 ma wyświetlić się status KONIEC w innym wypadku KONTYNUUJEMY :),
        */

        /* statusy i wybór ze switch case to najczęstsze użycia enumów, enumy są często używane
         * w różnego rodzaju listach, selectach jako krótkie opcje wyboru np. jako status A, X (Aktualny, Usunięty) */

        Scanner scan = new Scanner(System.in);
        int liczba;
        boolean czyKoniec = false;

        while (true) {
            System.out.println("Podaj liczbę: ");
            liczba = scan.nextInt();

            switch (liczba) {
                case 0:
                    czyKoniec = StatusEnum.KONIEC.status;
                    break;
                case 1:
                    System.out.println(LiczbyEnum.JEDEN);
                    break;
                case 2:
                    System.out.println(LiczbyEnum.DWA);
                    break;
                case 3:
                    System.out.println(LiczbyEnum.TRZY);
                    break;
                case 4:
                    System.out.println(LiczbyEnum.CZTERY);
                    break;
                case 5:
                    System.out.println(LiczbyEnum.PIĘĆ);
                    break;
                case 6:
                    System.out.println(LiczbyEnum.SZEŚĆ);
                    break;
                default:
                    System.out.println("Program nie obsługuje tej liczby");
                    break;
            }
            if(czyKoniec == true)
            {
                System.out.println(StatusEnum.KONIEC);
                break;
            }
            else
                System.out.println(StatusEnum.KONTYNUUJEMY);


        }

    }
}

//a) Stworzyć prosty enum "LiczbyEnum" z liczbami od 1 do 6 zapisanymi słownie,
enum LiczbyEnum {
    JEDEN, DWA, TRZY, CZTERY, PIĘĆ, SZEŚĆ;
}

//b) stworzyć prosty enum "StatusEnum" z wartościami KONTYNUUJEMY i KONIEC,
enum StatusEnum {
    KONTYNUUJEMY(false), KONIEC(true);

    boolean status;

    StatusEnum(boolean czyKoniec) {
        status = czyKoniec;
    }
    }