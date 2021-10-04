public class PetlaTablica {
    public static void main(String[] args) {

        //Program wyświetla wszystkie elementy tablicy
        // rosnąco, malejąco i sumuje wszystkie elementy.

        int[] tab = {12, 454, 1, 90, 44, 34, 2, 9, 99, 1000};

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println("");
        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.print(tab[i] + " ");
        }
        int wyn = 0;
        for (int i = 0; i < tab.length; i++) {
            wyn += tab[i];
        }
        System.out.println("");
        System.out.println("Suma elementów tablicy: " + wyn);
    }
}
