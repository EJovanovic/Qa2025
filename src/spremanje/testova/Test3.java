package spremanje.testova;
//Napisati funkciju razlikaJedan(int[] niz) koja proverava da li se svaki susedni element u nizu razlikuje za tacno 1.
public class Test3 {
    public static boolean razlikaJedan(int[]niz){
        for(int i=0;i<niz.length-1;i++){
            if(Math.abs(niz[i]-niz[i+1])!=1){//posto koristimo apsolutnu vrednost(jer tacno jedan) mora biti math.abs
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        int[]niz={1,2,3,4,5};
        System.out.println(razlikaJedan(niz));
    }

}
/** da li se susedni broj razlikuje za jedan
 * prvo ide jedna for petlja, od nule do pretposlednjeg jer naravno poslednji nema sledeci broj i dodaje jedan po jedan
 * ako je ovde koristimo apsolutnu vrednost jer je u pitanju tacno za jedan
 * postavljamo if uslov u njemu Math.abs i u zagradi od trenutnog broja oduzimamo sledeci i ako on nije jednak jedinici
 * ti vrati false
 */