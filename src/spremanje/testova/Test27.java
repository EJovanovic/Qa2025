package spremanje.testova;
// Napisati funkciju koja ispituje da li je niz monoton ili nije. Niz je monoton ako je ili rastuci ili opadajuci ili konstantan, ali ne i rastuci i opadajuci.
public class Test27 {
    public static boolean daLiJeNizMonoton(int[]niz){
        if(niz.length<=1){//ako je niz manji od 1, on je monoton
            return true;//vraca jeste
        }
        boolean rastuci=false;
        boolean opadajuci=false;
        for(int i=0;i<niz.length-1;i++){
            if (niz[i] < niz[i+1]) {
           rastuci=true;//ako je trenutni element manji od sledeceg
        }
            else if(niz[i]>niz[i+1]){
                    opadajuci=true;
            }
            if(rastuci && opadajuci){
                return false;}

            }
        return true;
/*a li je NIZ monoton, monoton je ako je rastuci ili opadajuci ili konstantan ali ne i rast i opad
        ako je duzina niza manjna od 1 onda je monoton, stavi da su pocetne vred boolean opadajuci i rastuci false
        *ako
 */
    }
    public static void main(String[]args){
        int[] niz1={1,2,3,4,5,6};//rastuci
        System.out.println(daLiJeNizMonoton(niz1));

    }
}
