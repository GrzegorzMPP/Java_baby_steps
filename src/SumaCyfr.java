public class SumaCyfr {public static void main(String[] args) {
    int rok = 2024;

    if ((rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0)) {
        System.out.println(rok + " to rok przestępny.");
    } else {
        System.out.println(rok + " to rok nieprzestępny.");
    }
}
}
