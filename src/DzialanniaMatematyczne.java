public class DzialanniaMatematyczne {
    public static void main(String[] args) {
        // Dodawanie
        int suma = 5 + 3;
        System.out.println("Suma: " + suma);

        // Odejmowanie
        int roznica = 10 - 4;
        System.out.println("Różnica: " + roznica);

        // Mnożenie
        int iloczyn = 6 * 7;
        System.out.println("Iloczyn: " + iloczyn);

        // Dzielenie
        double iloraz = 15.0 / 3;
        System.out.println("Iloraz: " + iloraz);

        // Reszta z dzielenia (modulo)
        int reszta = 17 % 4;
        System.out.println("Reszta z dzielenia: " + reszta);

        // Inkrementacja
        int liczba = 5;
        liczba++;
        System.out.println("Po inkrementacji: " + liczba);

        // Dekrementacja
        liczba--;
        System.out.println("Po dekrementacji: " + liczba);

        // Potęgowanie
        double potega = Math.pow(2, 3);
        System.out.println("2 do potęgi 3: " + potega);

        // Pierwiastkowanie
        double pierwiastek = Math.sqrt(25);
        System.out.println("Pierwiastek z 25: " + pierwiastek);

        // Wartość bezwzględna
        int wartoscBezwzgledna = Math.abs(-10);
        System.out.println("Wartość bezwzględna: " + wartoscBezwzgledna);

        // Funkcje trygonometryczne
        double sinWartosc = Math.sin(Math.toRadians(30)); // sin 30 stopni
        System.out.println("Sinus 30 stopni: " + sinWartosc);

        // Stałe matematyczne
        System.out.println("Liczba pi: " + Math.PI);
        System.out.println("Liczba Eulera: " + Math.E);
    }
}
