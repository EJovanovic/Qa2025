package spremanje.testova;
/*Napisati funkciju prvoPojavljivanje koja prima niz celih brojeva i
neki ceo broj i vraca indeks prvog pojavljivanja tog prosledjenog
broja u tom prosledjenom nizu. Ako se taj broj ne nalazi u
prosledjenom nizu, vratiti broj -1

 */
public class Test34 {
    public static int prvoPojavljivanje(int[]niz,int broj) {
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] == broj) {
                return i;

            }
            return -1;

        }
    }
