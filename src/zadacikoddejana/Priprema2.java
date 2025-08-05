package zadacikoddejana;
//Napisati funkciju naizmenicniParNepar(int[] niz)
// koja proverava da li se u nizu parni i neparni brojevi smenjuju.
public class Priprema2 {
    public static boolean naizmenicniParNepar(int[]niz){
        for(int i=0;i<niz.length-1;i++){//proverava par i zato ide do pretposlednjeg broja
            if(niz[i]%2==0 && niz[i+1]%2==0 || niz[i]%2!=0 && niz[i+1]%2!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        int[]niz={1,2,4,5,6};
        boolean rezultat=naizmenicniParNepar(niz);
        System.out.println(rezultat);
    }
}
/** naizmenicni par i nepar
 * boolean jer vraca da li je, u zagradi dajemo niz, for petlja ide od nule do pretposlednjeg jer proverava par
 * a poslednji element nema par. U petlji ide if uslov,u if uslov stavljamo ako je niz trenutnog elemnta
 * deljiv sa dva i sledeci element u nizu deljiv sa dva tj PARAN. i+1 koristimo za sledeci element u nizu
 * obicno kod poredjenja trenutnog i sledeceg broja.
 * dakle proverava prvo da li i niz trenutnog i sledeceg parni
 * ili trenutni u nizu i sledeci neparni. ako je i jedan true od ova dva uslova on ce vratiti false.
 * zatvoris obe petlje, i return true
 */