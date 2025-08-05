package spremanje.testova;
//17. Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".
public class Test21 {
    public static boolean daLiSeImeNalaziUNizu(String[]niz){//ovde pazi jer mu dajes string niz i mora biti string
        for(int i=0;i< niz.length;i++){//prolazi kroz petlju
            if(niz[i].equals("Marija") || niz[i].equals("Petar")){//ovde ako se nesto crveni nisi stavila zagradu i koristi .equals za string
                return true;//return ide u petlju jer i ako je prvo ime marija treba da ga prikaze, pazi ovde!!
            }//ovde isto ide || a ne && jer ovo prvo znaci ili a ovo drugo I!!!!
        }
        return false;
    }
    public static void main(String[]args){
        String[]niz={"Ana","Svetlana","Marija","Bogdana"};
        boolean rezultat=daLiSeImeNalaziUNizu(niz);
        System.out.println(rezultat);

    }
}
/**niz niski je dakle STRING
 * posalji string niz a on nek vrati boolean
 * prodji kroz petlju
 * ako je element iza .equals pa u zagradi ime pod navodnicima
 * u ovom slucaju marija ili petar stavi ||
 * vrati true u suprotnom vrati false
 *
 */
