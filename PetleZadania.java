public class PetleZadania {
    public static void main(String[] args) {
        int licznik;
        for (licznik = 0; licznik < 31; licznik++) {
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

        int[] tablica1 = new int[10];
        for (int i = 0; i < tablica1.length; i++) {
            System.out.println("Tablica1 " + i);
        }

        int[] tablica2 = new int[10];
        for (int j = tablica2.length; j >= 0; j--) {
            System.out.println("Tablica2 " + j);
        }
        int wynik = 0;
        for (int i : tablica1) {
            wynik += i;
        }
        System.out.println("Suma elementów tablicy: " + wynik);


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
        System.out.println("wynik: " + wyn);

        int liczba = 5;
        int wynikSilnia = 1;
        for (int i = liczba; i >= 1; i--) {
            wynikSilnia = wynikSilnia * i;
        }
        System.out.println("wynik Silnia: " + wynikSilnia);

        int n = 5;
        int liczbaGwiazdek = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= liczbaGwiazdek; j++) {
                System.out.print("*");
            }
            System.out.println();
            liczbaGwiazdek++;
        }

        int liczbaGwiazdeklustrzanych = 1;
        int liczbaSpacjiLustrzanych = n - 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= liczbaSpacjiLustrzanych; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= liczbaGwiazdeklustrzanych; j++) {
                System.out.print("*");
            }

            System.out.println();
            liczbaSpacjiLustrzanych--;
            liczbaGwiazdeklustrzanych++;
        }
    }
}