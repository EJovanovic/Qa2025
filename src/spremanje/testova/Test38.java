package spremanje.testova;
/*7. Napisati funkciju koja prima niz celih brojeva i:
a) Vraca drugi najveci element
b) Vraca drugi najamnji element

 */
public class Test38 {
    public static int vratidrugiNajveci(int[]niz){
        if(niz.length<2){//ako je duzina niza manja od dva
            return new int[]{-1,-1};
        }
        int prviNajveci= Integer.MIN_VALUE;
        int drugiNajveci=Integer.MIN_VALUE;
        for(int i=0;i< niz.length;i++) {
            if (niz[i] > prviNajveci) {
                prviNajveci=drugiNajveci;
                prviNajveci = niz[i];
            }
            else if(niz[i]>drugiNajveci && niz[i]!=prviNajveci){
                drugiNajveci=niz[i];

            }

        }
            return prviNajveci;
        }



}
