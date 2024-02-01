import java.util.Arrays;
public class SortowaniePrzezWybieranie {
    public static void main(String[] args) {
        int[] liczby = {5, 2, 8, 1, 7};
        selectionSort(liczby);
        System.out.println("Posortowana tablica: " + Arrays.toString(liczby));
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}