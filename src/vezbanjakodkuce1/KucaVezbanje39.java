package vezbanjakodkuce1;

// Napisati funkciju koja vraca najveci element niza.
public class KucaVezbanje39 {
    public static int najveciEelement(int []x){
    int max=x[0];//inicijalizujemo max vrednost pre petlje
        for(int i=0;i<x.length;i++) {//i krece od nule, mora biti manji od duzine niza i dodaje se jedan po jedan element
            if (x[i] > max) {
                max=x[i];//ovde si pogresila jer si prvo stavila x[i] a treba prvo da bude max


            }
        }
         return max;
    }
public static void main(String[]args){
        int[] niz={5,9,7,511,19,16,294,4};//ne zaboravi da dodas zagrade pre niza
  int i=  najveciEelement(niz);
    System.out.println("najveci element niza je" +i);

}
}
