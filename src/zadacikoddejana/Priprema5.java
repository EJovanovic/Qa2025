package zadacikoddejana;
//Napisati funkciju najveciPad(int[] niz) koja vraca
// najveci pad (razliku) izmedju dva broja tako da veci broj dolazi pre manjeg.
public class Priprema5 {
    public static int najveciPad(int[]niz){
        int maxPad=0;
       for(int i=0;i<niz.length-1;i++) {//ide do pretposlednjeg jer poslednji ne moze da uporedi
           for (int j = i + 1; j < niz.length; j++) {//Ovaj kod koristi dva for petlje, jedna unutar druge. To je uobičajeni način za prolazak kroz sve parove elemenata u nizu i poređenje tih parova
               // i+1 zato sto poredi i sa svakim sledecim
               if (niz[i] > niz[j]) {
                   int pad = niz[i] - niz[j];//ako je prethodni veci od sledeceg ti zapisi tu razliku i dodaj joj vrednost

                   if (pad > maxPad) {//ovde su ugnjezdeni ifovi jer drugi zavisi od prvog
                       maxPad = pad;
                   }

               }
           }
       }
       return maxPad;

        }
    }

/** najveci pad jeste razlika kad veci dolazi pre manjeg
 * inicijalizujemo max pad jer cemo tu cuvati razliku a posto je jos nismo nasli onda je ona NULA
 * Imamo dve ugnjezdene petlje
 * prva for petlja ide od nule, pa sve do pretposlednjeg elementa jer on ne moze da se uporedi
 * zatim nova for petlja koja je odmah ispod ove koja ide od i+1 dakle od sledeceg elementa i sve dok je
 * kraja niza, jedan po jedan njoj dajemo novo ime int j npr.
 * ide uslov ako je niz prvi veci od ovog sledeceg ,tj ako je trenutni broj veci od sledecegako jeste onda
 * je doslo do pada tj veci broj dolazi pre manjeg
 * ako je do toga doslo onda racunamo razliku izmedju trenutnog broja i tog sledeceg
 * ugnjezdeni su if uslovi jer drugi zavisi od prvog
 * u tom drugom if mi poredimo tu razliku koju smo nazvali int pad i max pad koji smo inicijalizovali na pocetku
 * ako jeste onda je max pad sada taj pad. max pad=pad; ide prvo max jer mu dodeljujemo vrednost
 * kad sve se petlje zatvore onda ide return
 *
 */