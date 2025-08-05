package spremanje.testova;
//Napisati funkciju najveciPad(int[] niz)
// koja vraca najveci pad (razliku) izmedju dva broja tako da veci broj dolazi pre manjeg.
public class Test25 {
    public static int najveciPad(int[] niz) {
        int maxPad = 0;//ovde cuvamo najveci pad koji nadjemo,stavljamo na nulu jer pretpostavljamo da nije bilo razlike

        //ova petlja ide sve do pretposlednjeg, osim poslednjeg,ne ide do poslednjeg jer nemamo sa cime da ga uporedimo
        for (int i = 0; i < niz.length - 1; i++) {//niz.length-1( znaci da ne ukljucuje poslednji) a <niz.length da ukljucuje poslednji
            //i+1 jer poredimo sa svakim sledecim
            for (int j = i + 1; j < niz.length; j++) {
                if (niz[i] > niz[j]) {//ovo proveravamo ako je prethodni veci od sledeceg onda smo imali pad
                    int pad = niz[i] - niz[j];//racunamo razliku tog pada

                    if (pad > maxPad) {//proverava da li je pad veci od prethodnog najveceg
                        maxPad = pad;//ako jeste onda je on max pad
                    }
                }
            }
        }
        return maxPad;
    }
}
/**najveci pad
 * inicijalizujem najveci pad kao max i on je jednak nuli
 * idem petljom od prvog elementa do pretposlednjeg
 * onda ponovo imam novu petlju i njom idem od drugog broja dakle i+1o poslednjeg
 * ako je niz prve petlje tj element prve petlje veci od elementa druge petlje onda inicjalizujem novu
 * promenljivu pad dakle postoji pad koji predstavlja razliku elementa prvog niza i drugog niza
 * ako je taj pad koji predstavjlja razliku veci od max pad onda je max pad taj pad i samo return max pad
 */








