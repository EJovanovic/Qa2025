package spremanje.testova;
//13. Napisati funkciju koja nadovezuje 2 niza, drugi na kraj prvog.
//Primer: [1, 2, 3] [17, 20, -3, 14, 20] -> [1, 2, 3, 17, 20, -3, 14, 20]
public class Test18 {
    public static int[] nadoveziDvaNiza(int[] niz1, int[] niz2) {
        //pravimo novi niz
        int[] niz3 = new int[niz1.length + niz2.length];//pravimo novi niz duzine a+b
        for (int i = 0; i < niz1.length; i++) {//dodali smo elemente iz a petlje
            niz3[i] = niz1[i];//c ima sve elemente koje ima a, kopiramo sve elemente iz a u c
        }
        for (int i = 0; i < niz2.length; i++) {//pristupam drugom nizu
            niz3[niz1.length + i] = niz2[i];//ovde govorimo gde da se stavi prvi element drugog niza u novi niz


        }
        return niz3;

    }

    public static void main(String[] args) {
        int[] niz1 = {1, 2, 3, 5, 6};//inicijalizujem prvi niz
        int[] niz2 = {2, 1, 4, 8};//inicijalizujem drugi niz
        int[] niz3 = (nadoveziDvaNiza(niz1, niz2));//inicijalizujem treci niz koji nastaje nadovezivanjem dakle zovem funkcijy
        for (int i = 0; i < niz3.length; i++) {//uvodim petlju jer mora proci kroz sve
            System.out.println(niz3[i]);//pozivam ispis ali svakog elementa niza
        }
    }
}
/**nadovezi dva niza
 * pravim novi niz on treba da bude duzine prvog i duzine drugog i tu vrednost mu dodeljujem
 * prolazim kroz petlju prvog niza i kopiram sve elemente u taj novi niz dakle samo stavljam da su elementi iz niza 3 sada jedn\
 * jednaki elementima iz niza 1
 * a za drugi niz, for petlja, i sada u niz 3 smestamo duzinu prvog niza+i tj na drugi indeks smestamo drugi niz
 *return treci niz
 */