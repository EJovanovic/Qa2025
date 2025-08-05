package spremanje.testova;
//16. Napisati funkciju koja racuna prosecnu vrednost double[] niza.
public class Test20 {
    public static double izracunajVrednost(int[] niz) {
        int suma = 0;//inicijalizujem sumu na nula
        for (int i = 0; i < niz.length; i++) {//prolazim kroz petlju
            suma += niz[i];//dodajem svaki element u sumu
        }

        return suma / niz.length;// ovde moze odmah return pa suma podeljena sa duzinom niza
        //a moglo je i double prosek=double(suma)/niz.length
    }

    public static void main(String[] args) {
        int[] niz = {1, 2, 3, 5, 4};
        double vrednost = izracunajVrednost(niz);//ovde moras staviti double vrednost
        System.out.println(vrednost);
    }
}
/**prosecna vrednost double niza
 * incijalizujem sumu na nulu
 * prolazim petljom od prvog do poslednjeg u nizu i dodam sumu na na elemente niza
 * double prosek=double suma podeljeno sa niz.length dakle prosek je zbir elemenata podeljen sa brojem elemenata
 * a to je zapravo duzzina
 */