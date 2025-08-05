package spremanje.testova;

import java.util.Arrays;

//Napisati funkciju monotonRastuci(int[] niz) koja proverava da li su svi elementi niza strogo rastuci.
public class Test1 {
    public static boolean monotonRastuci(int[] niz) {
        for (int i = 0; i < niz.length - 1; i++) {// krece od nule, ide do pretposlednjeg, jer pretposlednji nemamo sa cime da uporedimo
            if (niz[i] >= niz[i + 1]) {//posto je strogo rastuci proveravam i da li je jednak prethodnom i zato ide >=
                // ako je element niza veci od elementa niza plus jedan
                return false;//ako nadje jedan da nije ovo ide u petlji, return ide u petlju jer cim nadje taj jedan treba da izadje iz peetlje
            }//zatvaranje if
        }//zatvaranje for petlje
            return true;//ovo ide van petlje

        }//zatvaranje funkcije monotonRastucci

    public static void main(String[]args){
        int[]niz={1,2,3,4,5,};
        System.out.println(monotonRastuci(niz));//jer vraca boolean
       // monotonRastuci(niz);
        //System.out.println(Arrays.toString(niz));//ovo mora da se upise kod vrednosti niza


    }//zatvaranje main metode

}//zatvaranje klase
