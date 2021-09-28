public class StringWyswietlanie {
      public static void main(String[] args) {

          // Program wyświetla "oswiadczenie" każdy znak w nowej linii
          // od początku do końca, a następnie od końca do początku.


            String oswiadczenie = "Dasz radę !";
            for (int i = 0; i < oswiadczenie.length(); i++){
                System.out.println(oswiadczenie.charAt(i));
            }
            System.out.println("");
            for (int i = oswiadczenie.length() - 1; i >= 0; i--){
                System.out.println(oswiadczenie.charAt(i));
            }
      }
}
