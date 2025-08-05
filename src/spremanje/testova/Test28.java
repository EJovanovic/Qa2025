package spremanje.testova;
//apisati funkciju koja ispituje da li je niz strogo monoton ili nije. Niz je strogo monoton ako je iskljucivo rastuci ili iskljucivo  opadajuci
// i u nikojem delu nije konstantan (nema ponavljajucih elemenata)
public class Test28 {
    public static boolean daLiJeNizMonoton(int[] niz) {
        boolean rastuci = false;
        boolean opadajuci = false;
        for (int i = 0; i < niz.length - 1; i++) {
            if (niz[i] == niz[i + 1]) {
                return false;//niz nije monoton ako se ponavljaju elementi
            }
            if (niz[i] < niz[i + 1]) {
                rastuci = true;//svaki element manji od sledeceg je rastuci
            } else if (niz[i] > niz[i + 1]) {
                opadajuci = true;//svaki element veci od sledeceg je opadajuci
            }
            if (rastuci && opadajuci) {
                return false;//nije strogo monoton
            }
        }
            return rastuci || opadajuci;
        }


    public static void main(String[]args){
        int[] niz={1,2,3,4,5,6,7};
        boolean rezultat=daLiJeNizMonoton(niz);
        System.out.println(rezultat);

    }

}
