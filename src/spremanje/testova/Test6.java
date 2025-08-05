package spremanje.testova;
//funkcija koja ispisuje svaki drugi element niza
public class Test6 {
    public static void ispisiSvakiDrugiElement(int[]niz) {
        for (int i = 0; i < niz.length; i += 2) {//ovde si pogresila dakle znak je +=2!!!
            System.out.println(niz[i]);

        }
    }

        public static void main(String[]args){
        int[]niz={1,2,3,4,5,6};
        ispisiSvakiDrugiElement(niz);
        }



}
/**svaki drugi element niza
 * for petlja ide od prvog  do kraja niza i dodaje i+=2, pazi da ne napises ++2 jer to ne moze
 */
