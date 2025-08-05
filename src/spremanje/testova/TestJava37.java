package spremanje.testova;
/*Napisati funkciju koja prima dva niza celih brojeva i vraca novi niz dobijen sabiranjem ta dva niza. Zbir dva niza je novi niz ciji element na ideksu i je
 zbir elemenata na indeksu i prvog i drugog niza. Ako prosledjeni nizovi nisu istih duzina:a) vratiti prazan niz: []
b) Elemente na indeksima koji ne postoje u datom nizu smatrati da su 0
 */
public class TestJava37 {
    public static int[] vratiZbirNizova(int[]niz1,int[]niz2){
        if(niz1.length!=niz2.length){
            return new int[0];//prazan niz

        }
        int[]niz3= new int[niz1.length];
        for(int i=0;i< niz1.length;i++){//uzmi podatke ovog niza i prebaci ih u niz3
            niz3[i]=niz1[i]+niz2[i];
        }
        return niz3;
    }
}
