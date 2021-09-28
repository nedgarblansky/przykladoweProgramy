public class StawkaPodatkuObliczenie {
    public static void main(String[] args) {

        // Program po podaniu "zarobki" oblicza wartość podatku
        // I stawki i po jej przekroczeniu, II stawki.

        // Jeśli "zarobki" są mniejsze lub równe 0
        // wyświetla komunikat :)

        int zarobki = -1;

        int kwotaGraniczna = 85528;
        double stawka1 = 0.17;
        double stawka2 = 0.32;

            if (zarobki > 0 && zarobki<= kwotaGraniczna) {
                System.out.println("Twój podatek to: " + (zarobki*stawka1));
            } else if (zarobki > kwotaGraniczna) {
                System.out.println("Twój podatek to: " + (((kwotaGraniczna*stawka1)+((zarobki-kwotaGraniczna)*stawka2))));
            } else if (zarobki <= 0)
                System.out.println("Bez jaj... nic nie zarobiłeś?");

    }
}


