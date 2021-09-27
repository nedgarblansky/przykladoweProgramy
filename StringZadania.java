public class StringZadania {
    public static void main(String[] args) {

        System.out.println("ZADANIE 1");
        String imie = "Jan";
        String nazwisko = "Kowalski";
        String imieNazwisko = "Jan Kowalski";
        String imiePrzykladowe = "Alicja";
        String imiePrzykladowe2 = "Jan";

        System.out.println("Liczba znaków - imię: " + imie.length());
        System.out.println("Liczba znaków - nazwisko: " + nazwisko.length());
        System.out.println("Liczba znaków - imię i nazwisko: " + imieNazwisko.length());
        System.out.println("Czy jest równe Alicja: " + imie.equals(imiePrzykladowe));
        System.out.println("Czy jest równe Jan: " + imie.equals(imiePrzykladowe2));
        System.out.println("Duże litery: " + imieNazwisko.toUpperCase());
        System.out.println("Zamiana: " + imieNazwisko.replace("a", "e"));

        System.out.println("ZADANIE 2");
        System.out.println();
        String oswiadczenie = "Potrafię co raz lepiej programować";
        for (int i = 0; i < oswiadczenie.length(); i++){
            System.out.println(oswiadczenie.charAt(i));
        }
        System.out.println("ZADANIE 3");
        System.out.println("");
        for (int i = oswiadczenie.length() - 1; i >= 0; i--){
            System.out.println(oswiadczenie.charAt(i));
        }
    }
}
