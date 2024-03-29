import java.util.Arrays;
public class SortowaniePrzezWstawianie {
    public static void main(String[] args) {
        int[] liczby = {5, 2, 8, 1, 7};
        insertionSort(liczby);
        System.out.println("Posortowana tablica: " + Arrays.toString(liczby));
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}