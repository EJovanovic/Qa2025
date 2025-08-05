package spremanje.testova;
// Napisati funkciju koja duplira sve elemente niza.
       // Primer: [1, 2, 3, 4, 5] -> [2, 4, 6, 8, 10]
public class Test15 {
    public static void duplirajElement(int[]niz) {//treba samo ispis znaci void
        for (int i = 0; i < niz.length; i++) {//idem kroz petlju
            niz[i] *= 2;//svaki element niza mnozim sa dva
            System.out.println(niz[i]);//ispisujem niz

        }
    }
        public static void main(String[]args){
        int []niz={1,2,3,5,8};
            duplirajElement(niz);//ovde ne treba sout jer je void
        }
    }

/** for petlja od prvog do poslednjeg
 * element tog niza pomnozi sa dva, tj taj trenutni i ispisi ovde nema return jer samo ispisuje dakle void
 */
