import java.util.Arrays;
public class SortowanieBabelkowe {
    public static void main(String[] args) {
    int[] liczby = {5, 2, 8, 1, 7};
    bubbleSort(liczby);
    System.out.println("Posortowana tablica: " + Arrays.toString(liczby));
}

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
