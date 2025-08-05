package spremanje.testova;
//obrnuti redosled

public class Test5 {
    public static void ObrnutiRedosled(int[]niz) {
        for (int i = 0; i < niz.length; i++) {//prvo unosis normalan red
            System.out.println(niz[i]);
        }
        for (int i = niz.length - 1; i >= 0; i--) {//ide od poslednjeg do prvog a prvi je nula i uzima i njega
            System.out.println(niz[i]);//ovde si napravila gresku ides obrnutim smerom dakle kreces od poslednjeg i ides unazad

        }
    }
    public static void main(String[]args){
        int[]niz={1,2,3,4,5,6};
        ObrnutiRedosled(niz);//posto je void ne sme sout, nego samo zovem funkciju

    }
}
// dakle ovde sam mogla odmah samo obrnuti niz bez prvog for, potreban mi je sout da bi ispisao niz, ne zaboravi to, ne stavljaj
//tacka zarez iza petlje i posto je void ne treba sout u dozivanju

/**obrnuti redosled
 * for petlja msm da moze direktno da ide od niz.length minus jedan, dakle od poslednjeg pa sve do prvog i racunajuci prvi
 * i smanjuje jedan po jedan
 */