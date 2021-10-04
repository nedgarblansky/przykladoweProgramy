public class PetlaOperacje {
    public static void main(String[] args) {

        // Przy użyciu pętli, program wyświetla wartości
        // rosnąco, malejąco, liczy parzyste,
        // wartości zawarte w przedziale między "int a" a "int b".

        int licznik;
        for (licznik = 0; licznik < 30; licznik++) {
            System.out.print(licznik + " ");
        }
        System.out.println();
        for (licznik = 30; licznik >= 0; licznik--) {
            System.out.print(licznik + " ");
        }
        System.out.println();
        int licznik2;
        for (licznik2 = 1; licznik2 <= 30; licznik2++) {
            if (licznik2 % 2 == 0) {
                System.out.println("Licznik 2: " + licznik2);
            }
        }
        int a = 2;
        int b = 12;
        int licznik3;
        for (licznik3 = a; licznik3 <= b; licznik3++) {
            System.out.println("Licznik 3: " + licznik3);
        }
    }
}
