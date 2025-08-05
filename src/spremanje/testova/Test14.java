package spremanje.testova;
//10. Napisati funkciju koja vraca najmanji element niza.
public class Test14 {
    public static int najmanjiElement(int[]niz){
        int min=niz[0];//stavljam prvi broj kao max iz tog niza
        for(int i=1;i< niz.length;i++){//krecem od drugog elementa, jer je prvi vec min
            if(niz[i]<min){
                min=niz[i];
                //ovde ne sme sout, tj u petlji//ako zelim jedan rezultat da obradi sout ide van petlje
            }
        }
        return min;
    }
    public static void main(String[]args){
        int[] niz={7,8,5,4,9,1,2};
        int vrednost=najmanjiElement(niz);
        System.out.println("najmanji element je" + vrednost);
    }
}
/**pa isto inicijalizuj min vrednost
 * prodji kroz niz ako trenutni element niza je manji od min ti min dodeli vrednost tog elementa u nizu i ispisi
 * return mora
 *
 *
 */