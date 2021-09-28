public class StringSprawdzanie {
    public static void main(String[] args) {

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
    }
}