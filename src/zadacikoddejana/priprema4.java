package zadacikoddejana;
//Napisati funkciju sviElementiUOpsegu(int[] niz, int min, int max
//
// ) koja proverava da li su svi elementi u zadatom opsegu [min, max].
public class priprema4 {
    public static boolean sviElementiUOpsegu(int[]niz,int min,int max) {
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] < min|| niz[i] > max) {
                return false;


            }
        }
        return true;
    }


        public static void main(String[]args){
        int[]niz={1,2,3,4,7,8};
        int min=8;
        int max=1;
        boolean rezultat=sviElementiUOpsegu(niz,max,min);
            System.out.println(rezultat);


        }

}
/** svi elementi u opsegu
 * u zagradi stavljamo i niz i max vrednost i min vrednost ovo su int
 * petlja koja ide kroz niz, krece od nule pa sve do kraja petlje i dodaje jedan po jedan
 * ako je element u nizu trenutni manji od min vrednosti ili veci od max onda nije u opsegu i vracamo false.
 *
 */