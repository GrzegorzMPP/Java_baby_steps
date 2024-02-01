public class NajwiekszyWspolnyDzielnik { public static void main(String[] args) {
    int liczba1 = 128;
    int liczba2 = 256;

    int nwd = znajdzNWD(liczba1, liczba2);

    System.out.println("Największy wspólny dzielnik (" + liczba1 + ", " + liczba2 + ") = " + nwd);
}

    static int znajdzNWD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
