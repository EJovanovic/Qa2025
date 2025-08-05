package spremanje.testova;
/*Napisati funkciju daLiSadrzi koja prima niz celih brojeva i neki ceo
broj i vraca odgovor na pitanje da li se taj broj nalazi u tom nizu ili
ne*/
public class Test33 {
    public static boolean daLiSadrzi(int[] niz, int broj) {
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] == broj) {
                return true;//zelimo odmah da zaustavimo ako nije taj broj u nizu
            }
        }
        return false;
    }
}


