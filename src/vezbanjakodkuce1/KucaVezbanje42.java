package vezbanjakodkuce1;
//12. Napisati funkciju koja sabira 2 niza iste duzine element po element. (Dakle prosledjujemo 2 niza, a vracamo taj novi niz)
//Primer: [2, 4, 6] + [1, 4, 4]  -> [3, 8, 10]
public class KucaVezbanje42 {
    public static int[] SaberiDvaNiza(int[] a, int[] b) {//u funkciji treba da se saberu dva niza
        int rezultat[] = new int[a.length];//rezultat je novi niz duzine a
        for (int i = 0; i < a.length; i++) {
            rezultat[i] = a[i] + b[i];//sabira dva niza


        }
        return rezultat;
    }

    public static void main(String[] args) {
        int[] niz1 = {1, 2, 3, 5};//inicijalizujem prvi niz
        int[] niz2 = {5, 7, 8, 9};//inicijalizujem drugi niz
        int[] vrednost = SaberiDvaNiza(niz1, niz2);//nova promenljiva je vrednost dva zbira
        for (int i = 0; i < vrednost.length; i++) {//mora petlja ovde jer bi u suprotnom samo prikazalo adresu
            System.out.println(vrednost[i]);//mora println
        }
    }
}
