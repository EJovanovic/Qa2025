package vezbanjakodkuce1;
//Napisati funkciju koja ispisuje sve parne brojeve zadatog niza.
public class KucaVezbanje38 {
    public static void ispisiParneBrojeve(int[]x) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) ;
            System.out.println(x[i]);

        }
    }
        public static void main(String[]args){
        int[]niz={1,2,8,5,9,1,7,4};
        ispisiParneBrojeve(niz);
    }

}
