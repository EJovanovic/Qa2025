package spremanje.testova;
//9.* Napisati funkciju koja sabira dva niza proizvoljne duzine.
//Npr: [1, 2, 3, 4, 5] + [1, 2, 3] -> [2, 4, 6, 4, 5]
//b)** -//- bez kreiranja dodatnih nizova
//
public class Test26 {
    public static int [] saberiNizove(int[]niz1,int[] niz2){//obavezno stavi zarez kad nabrajas nizove,tu gresis
            // Kreiramo novi niz sa dužinom većeg niza
            int duzina = Math.max(niz1.length, niz2.length);
            int[] zbirNiz = new int[duzina];

            // Prva petlja - za prvi niz
            for (int i = 0; i < niz1.length; i++) {
                zbirNiz[i] += niz1[i]; // Dodajemo elemente prvog niza u zbirNiz
            }

            // Druga petlja - za drugi niz
            for (int i = 0; i < niz2.length; i++) {
                zbirNiz[i] += niz2[i]; // Dodajemo elemente drugog niza u zbirNiz
            }

            return zbirNiz;
        }





