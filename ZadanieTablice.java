public class ZadanieTablice {
    public static void main(String[] args) {
        int [] tablica = new int[5];

        tablica[0] = 1;
        tablica[1] = 2;
        tablica[2] = 3;
        tablica[3] = 4;
        tablica[4] = 5;

        int suma = tablica[0] + tablica[1] + tablica[2] + tablica[3] + tablica[4];

        System.out.println("Suma składników tablicy: " + suma);
        System.out.println();
        double [][] tablicaDwuwymiarowa = {
                {1.1, 2.2, 3.3, 4.4, 5.5},
                {6.1, 7.2, 8.3, 9.4, 10.5},
                {11.1, 12.2, 13.3, 14.4, 15.5}
        };

        double suma1 = tablicaDwuwymiarowa[0][0] + tablicaDwuwymiarowa[0][1] + tablicaDwuwymiarowa [0][2] + tablicaDwuwymiarowa [0][3] + tablicaDwuwymiarowa[0][4];
        double suma2 = tablicaDwuwymiarowa[1][0] + tablicaDwuwymiarowa[1][1] + tablicaDwuwymiarowa [1][2] + tablicaDwuwymiarowa [1][3] + tablicaDwuwymiarowa[1][4];
        double suma3 = tablicaDwuwymiarowa[2][0] + tablicaDwuwymiarowa[2][1] + tablicaDwuwymiarowa [2][2] + tablicaDwuwymiarowa [2][3] + tablicaDwuwymiarowa[2][4];
        System.out.println("Suma składników wiersza 1: " + suma1);
        System.out.println("Suma składników wiersza 2: " + suma2);
        System.out.println("Suma składników wiersza 3: " + suma3);
    }
}
