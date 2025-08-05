package spremanje.testova;
/* da li su jednaki, jednaki su ako su iste duzine i ako imaju elemente na istim pozicijama
dakle napravi funkciju
 */

public class Test32 {
    public static boolean daLiSuJednak(int[]niz1,int[]niz2){
        //prvo proveri duzinu, pretpostavljamo da jesu jednaki
        if(niz1.length!= niz2.length) {
            return false;// i ovde se zavrsava sve ako nisu jednaki, uvek gledaj da nadjes krace i brze resenje
        }
        for(int i=0;i<niz1.length;i++) {
            if (niz1[i] != niz2[i]) {
                return false;//nadjemo razlicit element i odmah znamo da nisu jednaki
            }
        }
            return true;//nizovi su isti
            }
        }





