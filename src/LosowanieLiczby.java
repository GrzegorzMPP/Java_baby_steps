import java.util.Random;

public class LosowanieLiczby {
    public static void main(String[] args) {
        // Tworzymy obiekt klasy Random do generowania losowych liczb
        Random randomGenerator = new Random();

        // Losujemy liczbę od 1 do 6
        int wylosowanaLiczba = randomGenerator.nextInt(6) + 1;

        // Wyświetlamy wynik
        System.out.println("Wylosowana liczba: " + wylosowanaLiczba);
    }
}