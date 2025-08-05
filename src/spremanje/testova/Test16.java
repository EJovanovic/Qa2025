package spremanje.testova;
//12. Napisati funkciju koja sabira 2 niza iste duzine element po element. (Dakle prosledjujemo 2 niza, a vracamo taj novi niz)
//Primer: [2, 4, 6] + [1, 4, 4]  -> [3, 8, 10]
//
public class Test16 {
    public static int[] saberiDvaNiza(int[] niz1, int[] niz2) {//dajemo dva niza i treba da vrati niz
        if (niz1.length != niz2.length) {//prvo proveravamo da li su nizovi jednakki
            return new int[0];//ako nisu ti vrati prazan niz
        }
        int[] niz3 = new int[niz1.length];//ako jesu onda taj novi niz bice novi niz duzine prvog niza
        for (int i = 0; i < niz1.length; i++) {//prolazimo kroz petlju prvog niza
            niz3[i] = niz1[i] + niz2[i];//posto su iste duzine, onda ne moramo dve petlje

        }
        return niz3;
    }

    public static void main(String[] args) {
        int niz1[] = {1, 2, 3, 4, 5};
        int niz2[] = {1, 2, 3, 4, 9};
        int niz3[] = saberiDvaNiza(niz1, niz2);//pozivam bez []
        for (int i = 0; i < niz3.length; i++) {
            System.out.println(niz3[i]);
        }
    }
}

/*dakle prvo proveravam da li su nizovi iste duzine, ako nisu ti vrati novi prazan niz
pravim novi treci niz i stavljam da je iste duzine kao prvi niz, moze i drugi nebitno ako su isti
 kopiram sve elemente iz prvog niza for petljom, i mogu da kopiram i iz drugog niza a ne moram moze jedna petlja
 i tom novom nizu dajem vrednost prvog i drugog tako sto ih sabiram, posto su iste duzine ne moraju dve for petlje

*/