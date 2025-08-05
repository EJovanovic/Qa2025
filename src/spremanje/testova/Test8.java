package spremanje.testova;
//Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2
//b) Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.
public class Test8 {
    public static void ispisiSvakiTreci(int[]niz){
        for(int i=niz.length-1;i>=0;i-=3) {//opet si stavila ; pazi!!!
//ide unazad, dakle kreni od poslednjeg,dok god je veci od nule i svaki treci prikazi
            System.out.println(niz[i]);//ne zaboravi sout za ispis
        }
    }
    public static void main(String[]args){
        int [] niz={1,2,3,4,87,78,8,8,4};
        ispisiSvakiTreci(niz);
    }


}
/** ispisi svaki treci u obrnutom redosledu
 * for petlja ide od niz.length-1cdakle od poslednjeg do nule i dodaje +=3
 *dakle ako pise i=niz.length-1 onda ide od poslednjeg, ako stoji i<niz.length-1 onda je pretposlednji
 da razjasnimo:
 i=0;i<niz.length,i++ Ovo znaci da krece od nule od prvog elementa i sve dok je i tj broj manji od onoliko
 elemenata koliko ima niz on dodaje jedan po jedan dakle od prvog do poslednjeg
 i=0;i<niz length,i++/ dakle ide od prvog do poslednjeg elementa ukljucujuci i poslednji
 i=0;i<niz.length-1 ovo ide do pretposlednjeg
 i=niz length-1;i>=0;i-- ovo ide od poslednjeg i smanjuje
 i=niz length-2 ide od pretposlednjeg
 **/