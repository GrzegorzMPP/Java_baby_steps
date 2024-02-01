import java.util.Random;
public class GeneratorHistoriiRPG {
    public static void main(String[] args) {
        // Przykładowe postaci
        String[] postacie = {"Bohater", "Złoczyńca", "Mędrzec", "Elf", "Wojownik", "Czarodziej"};

        // Przykładowe miejsca
        String[] miejsca = {"Zamek", "Las", "Jaskinia", "Miasto", "Wioska"};

        // Przykładowe konflikty
        String[] konflikty = {"Walka o władzę", "Poszukiwanie zaginionej skarbnicy", "Obrona przed inwazją", "Rozwiązanie tajemniczego morderstwa"};

        // Losowe wybieranie postaci, miejsca i konfliktu
        String wybranaPostac = losowyElement(postacie);
        String wybraneMiejsce = losowyElement(miejsca);
        String wybranyKonflikt = losowyElement(konflikty);

        // Generowanie historii
        String historia = generujHistorie(wybranaPostac, wybraneMiejsce, wybranyKonflikt);

        // Wyświetlanie historii
        System.out.println(historia);
    }

    // Metoda do losowego wybierania elementu z tablicy
    static String losowyElement(String[] tablica) {
        Random random = new Random();
        int indeks = random.nextInt(tablica.length);
        return tablica[indeks];
    }

    // Metoda do generowania historii na podstawie wybranych elementów
    static String generujHistorie(String postac, String miejsce, String konflikt) {
        return postac + " wyrusza do " + miejsce + ", aby rozwiązać problem: " + konflikt + ".";
    }

}
