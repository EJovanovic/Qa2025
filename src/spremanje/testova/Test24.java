package spremanje.testova;
//Napisati funkciju sviElementiUOpsegu(int[] niz, int min, int max) koja proverava da li su svi elementi u zadatom opsegu [min, max].
public class Test24 {
    public static boolean sviElementiUOpsegu(int[] niz, int min, int max) {//ovde pisem niz, int min i int max
        for (int i = 0; i < niz.length; i++) {//prolazimo kroz petlju
            if (niz[i] < min || niz[i] > max) {//ako neki element je manji od najmanjeg i veci od najveceg vracamo false
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] niz = {1, 2, 3, 6, 8, 9};
        int min = 1;
        int max = 9;
            boolean rezultat = sviElementiUOpsegu(niz, min, max);//prosledjujem ceo niz a ne niz elemenata
            System.out.println(rezultat);
        }

    }


/** svi elementi u opsegu
 * vrati boolean a unesi niz i max i min vrednost
 * prodji kroz for petlju ako je neki element manji od min i veci
 *ti vrati false jer onda nije u opsegu
 */
