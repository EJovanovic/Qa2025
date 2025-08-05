package spremanje.testova;
//Napisati funkciju koja ispisuje sve neparne brojeve zadatog niza.
public class Test11 {
    public static void ispisiNeparneBrojeve(int[]niz) {
        for (int i = 0; i < niz.length; i++) {//idi kroz petlju
            if (niz[i] % 2 != 0) {//sve dok broj nije deljiv sa dva
                System.out.println(niz[i]);//ti ga ispisi
            }
        }
    }

        public static void main(String[]args){
        int[] niz={1,24,7,9,6,2,3};
        ispisiNeparneBrojeve(niz);
    }
}
/**for petlja ide od prvog do poslednjeg i dodaje jedan po jedan
 * if uslov ako element tog niza nije deljiv sa dva onda ga ispisi
 */