package spremanje.testova;
/*Napisati funkciju neparni koja prima niz celih brojeva i vraca novi
niz ciji su svi elementi oni elementi koji se nalaze na neparnim
indeksima prosledjenog niza i drugih elemenata nema.
Input: [1, 2, 2, 3], 2
Oytput: true
14
15
Primer 1:
Input: [1, 2, 3, 4, 5], 4
Output: 3
*/
public class Test35 {
    public static int[] neparniBrojevi(int[]niz){
//izracunavamo koliko ce elemenata biti u novom nizu
        int brojNeparnih=(niz.length+1)/2;//dodajem jedan na duzinu jer su neparni, ako su parni onda samo duzinu delim sa dva
        int[] nizNeparnijh= new int[brojNeparnih];//pravim novi niz te velicine
            int j=0;//ovo je indeks za novi niz
            // krece od jedinice jer je prvi neparan, i dodaje dva jer svaki drugi je neparan
            for(int i=1;i<niz.length;i+=2){
                nizNeparnijh[j]=niz[i];
                j++;

            }
            return nizNeparnijh;




        }
    }
}
