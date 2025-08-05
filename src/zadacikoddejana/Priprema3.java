package zadacikoddejana;
//Napisati funkciju sviPozitivniIliSviNegativni koja
// proverava da li su svi brojevi u nizu pozitivni ili svi negativni (nula se ne racuna).
public class Priprema3 {
    public static boolean viPozitivniIliSviNegativni(int[]niz){
        boolean sviPozitivni=true;//pretpostavljamo da su svi pozitivni//uvek pretpostavljamo pozitivno jer je lakse dokazivo
        boolean sviNegativni=true;//pretpostavljamo da su svi negativni
    for(int i=0;i<niz.length;i++) {

        if (niz[i] > 0) {//trenutni broj proverava, dakle za svaki, ako je prvi pozitivan onda su svi negativni false
            sviNegativni = false;//ide u petlju jer ako je jedan negativan onda vraca
        }
        if (niz[i] < 0) {
            sviPozitivni = false;//ako je bar jedan pozitivan vraca
        }
    }
            return sviNegativni || sviPozitivni;//ovo ide van petlje
        }
    }

/** svi pozitivni i svi negativni
 * boolean jer proverava da li je
 * na pocetku pretpostavljamo da  su svi svi brojevi pozitivni i da su svi negativni
 * ubacimo jednu petlju,ide od nule i do kraja petlje i dodaje jedan po jedan, do kraja jer treba da znamo
 * i da li je poslednji pozitivan ili negativan
 * if ako je broj u petlji veci od nule, onda je false, jer ako je i jedan negativan treba da nam rvati false
 */





