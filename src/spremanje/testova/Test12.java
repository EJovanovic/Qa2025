package spremanje.testova;
//Napisati funkciju koja ispisuje sve parne brojeve zadatog niza.
public class Test12 {
    public static void ispisiParneBrojeve(int[]niz) {
        for (int i = 0; i < niz.length; i++) {//idi kroz petlju
            if (niz[i] % 2 == 0) {//sve dok je broj deljiv sa dva
                System.out.println(niz[i]);//ti ga ispisi
            }
        }
    }

    public static void main(String[]args){
        int[] niz={1,24,7,9,6,2,3};
        ispisiParneBrojeve(niz);
    }
}
//for petlja ide od pocetka do kraja niza ako broj je deljiv sa dva onda ga ispisi