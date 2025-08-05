package spremanje.testova;
/*Napisati funkciju sviPozitivniIliSviNegativni koja proverava da li su svi brojevi u nizu pozitivni ili svi negativni
 (nula se ne racuna).
 */
public class Test4 {
    public static boolean sviPozitivniIliSviNegativni(int[]niz){
        boolean sviPozitivni=true;//pretpostavljamo da su svi pozitivni
        boolean sviNegativni=true;
        for(int i=0;i<niz.length;i++) {//niz length jer hocemo i njega da obuhvatimo
            if (niz[i] <= 0) {//niz ne moze biti pozitivan ako je manji od nule
                sviPozitivni=false;
            }
            if(niz[i]>=0){//ne moze biti negativan ako je veci od nule
               sviNegativni=false;
            }
        }
                return sviPozitivni || sviNegativni;//return ide van petlje jer treba da proveri sve elemente a ne samo prvi


        }
public static void main(String[]args){
        int[]niz={2,4,6,8,10,12,14};
    System.out.println(sviPozitivniIliSviNegativni(niz));

    }
}
/** svi pozitivni i svi negativni
 * boolean jer ispituje da li je nesto tacno
 * prvo inicijalizujem boolean sve pozitivne na true i sve negativne na true jer polazim od toga da jesu
 * idem kroz petlju od nule, do kraja niza i dodajem jedan po jedan
 * ako je trenutni element manji od nule onda su svi pozitivni false, jer onda on nije pozitivan a kako je niz veci od nule onda su svi negat
 *ako je trenutni element veci od nule onda nije negativan i svi negativni su false
 * na kraju zatvaram return posle svih petlji jer mora sve da proveri da bi vratio
 *
 * */
