package zadacikoddejana;
//Napisati funkciju monotonRastuci(int[] niz) koja proverava da li su svi elementi niza strogo rastuci.
public class Priprema1 {
    public static boolean monotonRastuci(int[]niz){
        for(int i=0;i<niz.length-1;i++) {//ide do pretposlednjeg
            if (niz[i] >= niz[i + 1]) {//veci ako je trenutni veci onda odmah vraca da nije rastuci
                return false;//ako nadjemo elemente koji nisu strogo rastuci onda odmah vraca false
            }
        }
            return true;
        }
        public static void main(String[]args) {
            int[] niz = {1, 2, 3, 4, 5, 1};
            boolean rezultat = monotonRastuci(niz);
            System.out.println(rezultat);
        }
    }

/**boolean kako bi vratio tacno ili netacno u zagradi ide niz a on nam vraca tacno ili netacno
 * zatim ide for petlja, ona ide od nule, sve do pretposlednjeg elementa niza i dodaje jedan po jedan element
 * ide do pretposlednjeg jer poslednji nema veci od njega. Zatim ide if uslov, gde elementi tog niza
 * veci ili jednaki(jer je strogo rastuci) Dakle ako je trenutni broj veci od sledeceg onda nam je rezultat false
 * u suprotnom je true.
 */
