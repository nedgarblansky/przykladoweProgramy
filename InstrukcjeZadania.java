public class InstrukcjeZadania {
    public static void main(String[] args) {
        int liczba = 3;

        if (liczba % 2 == 0) {
            System.out.println("Liczba parzysta");
        } else {
            System.out.println("Liczba nieparzysta");
        }


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


        int zmiennaA = 2;
        int zmiennaB = 3;
        char zmiennaZ = '+';

        switch (zmiennaZ) {
            case '+':
                System.out.println("Dodawanie: " + (zmiennaA + zmiennaB));
                break;
            case '-':
                System.out.println("Odejmowanie: " + (zmiennaA-zmiennaB));
                break;
            case '*':
                System.out.println("Mnożenie: " + (zmiennaA*zmiennaB));
                break;
            case '/':
                System.out.println("Dzielenie: " + (zmiennaA/zmiennaB));
                break;
             default:
                 System.out.println("Nie znam takiego znaku");

        }


        }
    }

