public class DzialaniaMatma {
    public static void main(String[] args) {

        //Program po wprowadzeiu "zmiennaA', "zmiennaB" oraz "zmiennaZ" - czyli znak
        //dokonuje działanie ze znaku lub wyświetla komunikat.

        int zmiennaA = 2;
        int zmiennaB = 3;
        char zmiennaZ = '+';

        switch (zmiennaZ) {
            case '+':
                System.out.println("Dodawanie: " + (zmiennaA + zmiennaB));
                break;
            case '-':
                System.out.println("Odejmowanie: " + (zmiennaA - zmiennaB));
                break;
            case '*':
                System.out.println("Mnożenie: " + (zmiennaA * zmiennaB));
                break;
            case '/':
                System.out.println("Dzielenie: " + (zmiennaA / zmiennaB));
                break;
            default:
                System.out.println("Nie znam takiego znaku");

        }

    }
}