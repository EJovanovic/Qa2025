package spremanje.testova;
//Izracunati proizvod elemenata tog niza.
//Primer: [2, 4] -> 8
public class Test9 {
    public static int proizvodNiza(int[] niz) {
        int proizvod = 1;//dakle proizvod je sada jedan! nemoj ovo da pogresis inace ce ti prikazivati nulu jer nula puta bilo koji broj je nula
        for (int i = 0; i < niz.length; i++) {
            proizvod *= niz[i];
            System.out.println(proizvod);


        }
        return proizvod;
    }

    public static void main(String[] args) {
        int[] niz = {1, 2, 3, 5, 7};
        int vrednost = proizvodNiza(niz);


    }
}
/** proizvod inicijalizujem na 1, jer sve sto se mnozi sa nulom daje nulu i onda bi i rezultat bio nula
 * zatim for petljom idem od prvog do poslednjeg elementa i dodajem jedan po jedan
 * proizvod mnozim sa trenutnim elementom niza
 */