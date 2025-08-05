package spremanje.testova;

import java.util.Arrays;

/*5. Napisati funkciju koja
 prima dva niza celih brojeva i vraca novi niz dobijen nadovezivanjem drugog niza na prvi niz.
 */
public class TestJava36 {
    public static int[] nadoveziNizove(int[] niz1, int[] niz2) {
        int[] niz3 = new int[niz1.length + niz2.length];//pravimo novi niz duzine prvog i drugog
        for (int i = 0; i < niz1.length; i++) {
            niz3[i] = niz1[i];//dodeli elemente prvog niza trecem niz
        }
        for (int i = 0; i < niz2.length; i++) {
            niz3[niz1.length + i] = niz2[i];//ovde kazemo kad se zavrsi prvi niz ti dodaj element od b tj dodeljujemo
        }
        return niz3;


    }

public static void main(String[]args){
    int []niz1={1,2,3,4};
    int []niz2={3,4,5,4};
    int[] niz3=(nadoveziNizove(niz1,niz2));
    System.out.println(Arrays.toString(niz3));//ovo umesto for petlje

}





