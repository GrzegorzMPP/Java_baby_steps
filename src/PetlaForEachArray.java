public class PetlaForEachArray {
    public static void main(String[] args) {
        String[] dniTygodnia = {"Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek"};

        System.out.println("Dni tygodnia:");
        for (String dzien : dniTygodnia) {
            System.out.println(dzien);
        }
    }
}
