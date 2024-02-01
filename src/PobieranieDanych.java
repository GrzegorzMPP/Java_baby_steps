import java.util.Scanner;


public class PobieranieDanych {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba;
        do {
            System.out.print("Podaj liczbę (wpisz 0 aby zakończyć): ");
            liczba = scanner.nextInt();
            System.out.println("Wprowadziłeś: " + liczba);
        } while (liczba != 0);
        System.out.println("Koniec programu.");
    }
}
