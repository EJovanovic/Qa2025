package spremanje.testova;
//ispisi sumu niza [1, 2, 3, 4, 5] -> 15 (1 + 2 + 3 + 4 + 5 = 15)
public class Test7 {
    public static int ispisiSumu (int[]niz) {
        int suma = 0;
        for (int i = 0; i < niz.length; i++) {
            suma += niz[i];//suma je prvo nula, kad prodje kroz ceo niz dodajem ceo niz na sumu

        }
        return suma;


    }

    public static void main(String[]args) {
        int[] niz = {1, 2, 5, 7};
        int vrednost=ispisiSumu(niz);//kad imam return moram da je dozovem tako sot cu prvo inicijalizovati int vrednost
        System.out.println("suma niza je: " + vrednost);//ovo mora na kraju da bi ispisalo rezultat
    }
}
/**ispisi sumu
suma se prvo inicijalizuje na nulu, jer nemamo i dalje nista u sumi
 zatim for petlja ide od prvog sto je nula do kraja niza i dodaje jedan po jedan
 suma+= ide na svaki trenutni element niza
 i return na kraju
 **/