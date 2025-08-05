package spremanje.testova;
//15. Napisati funkciju koja ispituje da li je suma niza veca od njegovog proizvoda.
public class Test19 {
    public static boolean daLiJeSumaNizaVecaOdProizvoda(int[] niz) {
        int suma = 0;//inicijalizujem sumu na nulu
        int proizvod = 1;//inicijalizujem proizvod na jedan
        for (int i = 0; i < niz.length; i++) {//idem kroz petlju
            suma += niz[i];//dodajem svaki element niza na sumu
            proizvod *= niz[i];//prolazimo kroz istu petlju
        }
        if (suma > proizvod) {//proveravam ako je suma veca od proizvoda onda true
            return true;
        } else {
            return false;//u suprotnom false
        }//zatvaram if


    }//zatvaram funkciju

    public static void main(String[] args) {
        int[] niz = {1, 2, 5, 78};//inicijalizujem niz
        boolean rezultat = daLiJeSumaNizaVecaOdProizvoda(niz);//boolean rezultat
        System.out.println(rezultat);//ispisuje rezultat
    }
}

/** da li je suma veca od proizvoda
 * inicijalizujem sumu a zatim i proizvod; suma ima vrednost nula, a proizvod vrednost jedan
 *prolazim kroz petlju
 * dodajem sumu na element niza
 * dodajem proizvod
 * if uslov ako je suma veca od proizvoda ti vrati true else vrati false

**/





