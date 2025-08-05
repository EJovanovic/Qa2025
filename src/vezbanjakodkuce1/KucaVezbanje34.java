package vezbanjakodkuce1;

import java.util.Scanner;

public class KucaVezbanje34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//prvo kreiram skener za unos sa tastature
        System.out.println("Unesite broj n: ");//trazi od korisnika da unese broj
        int n = sc.nextInt();//korisnik unosi broj n
        int[] arr = new int[n];//pravim niz
        for (int i = 0; i < n; i++) {// niz krece od nule sve dok je manji od n i dodaje broj po broj
            System.out.println("Unesite broj: " + (i + 1));//ispis svakog broja
            arr[i] = sc.nextInt();//korisnik unosi broj u niz
        }
        ispisiProizvodSvihTrecihBrojeva(arr);//provera



    }

    public static int ispisiProizvodSvihTrecihBrojeva(int[] x) {// funkcija za proizvod
        int proizvod = 1;//proizvod krece od jedinice, jer mnozenje krece od 1
        for (int i = x.length - 1; i >= 0; i -= 3) {// ide obrnutim redosledom
            System.out.println("Svaki treci element" + x[i]);//upis svakog treceg broja
            proizvod *= x[i];//proizvod tih brojeva
        }
            System.out.println("Ispisi proizvod brojeva: "+ proizvod);//ispid proizvoda

        return proizvod;


    }
}





