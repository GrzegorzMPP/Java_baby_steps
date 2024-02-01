
import java.util.Arrays;
public class SortowanieTablicy {
    public static void main(String[] args) {
        // Tworzymy tablicę liczb do posortowania
        int[] liczby = {5, 2, 8, 1, 7};

        // Wyświetlamy nieposortowaną tablicę
        System.out.println("Tablica przed sortowaniem: " + Arrays.toString(liczby));

        // Wywołujemy metodę sortującą
        Arrays.sort(liczby);

        // Wyświetlamy posortowaną tablicę
        System.out.println("Tablica po sortowaniu: " + Arrays.toString(liczby));
    }
}
