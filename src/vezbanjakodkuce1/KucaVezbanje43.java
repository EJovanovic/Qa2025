package vezbanjakodkuce1;
// Napisati funkciju koja nadovezuje 2 niza, drugi na kraj prvog.
//Primer: [1, 2, 3] [17, 20, -3, 14, 20] -> [1, 2, 3, 17, 20, -3, 14, 20]
public class KucaVezbanje43 {
    public static int[] nadoveziDvaNiza(int[] a, int[] b) {//ne zaboravi da deklarises kao niz a ne samo int
        int[] c = new int[a.length + b.length];//pravim novi niz sa obe duzine
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length+i] = b[i];// krecemo da ubacujemo b odmah iza poslednjeg elementa a
        }


        return c;
    }


public static void main(String[]args) {
    int[] a = {1, 2, 3, 8, 4};
    int[] b = {7, 8, 2, 82};
    int[] spojeni = nadoveziDvaNiza(a, b);
    for(int i=0;i< spojeni.length;i++){
        System.out.println(spojeni[i]);
    }
}


}

