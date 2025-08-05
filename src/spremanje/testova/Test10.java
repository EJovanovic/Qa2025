package spremanje.testova;
//Napisati funkciju koja racuna proizvod 3 broja
public class Test10 {
    public static int proizvodTriBroja(int[]niz){//ja ti dajem niz ti meni daj kao rezulat broj
       int proizvod=1;//opet si napravila gresku, proizvod je uvek jedan!!!inicijalizujem na 1
        if(niz.length<3){//proveravamo da li niz ima manje od 3 elementa
            System.out.println("niz mora sadrzati 3 broja: ");
            return 0;//vraca nulu jer treba da vrati integer

        }
        for(int i=0;i<3;i++){//zelimo samo prva tri broja zbog toga je i<3
            proizvod*=niz[i];//dodajemo proizvod na ovaj niz

        }
        return proizvod;//proslo je kroz sve elemente niza
    }
    public static void main(String[]args){
        int[]niz={1,2,3,4,5,6,7};
        int vrednost=proizvodTriBroja(niz);
        System.out.println(vrednost);

        }
    }
/** proizvod tri broja
 * proizvod incijalizujem na broj jedan
 * ako je duzina niza manja od 3 ti vrati nului sout niz mora imati tri broja
 * for petlja ide od prvog i manje od 3, jer ima tri iteracije pristupa indeksu o,1,2
 * i dodaje jedan po jedan i onda proizvod mnozi sa tim elementima niza
 */
