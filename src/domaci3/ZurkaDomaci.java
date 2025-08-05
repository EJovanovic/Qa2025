package domaci3;

import java.util.Scanner;

public class ZurkaDomaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite koliko pića zelite da kupite: ");
        int n = sc.nextInt();//korisnik unosi kolicinu
        int[] arr = new int[n];//pravljenje niza
        int ukupnaCena = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite cenu " + (i + 1) + ". pića: ");
            arr[i] = sc.nextInt();
            ukupnaCena += arr[i];
        }
        if (ukupnaCena > 5000) {
            System.out.println("Previše trošiš!");
        }
        else if (ukupnaCena >= 2000 && ukupnaCena <= 5000) {
            System.out.println("Može proći");
        }
        else {
            System.out.println("Skromna žurka, ali OK!");
        }
        int max = arr[0];// pretpostavljamo da je vrednost na indeksu nula maksimalna
        for (int cena : arr) {// prolazi kroz ceo niz
            if (cena > max) {//ako je vrednost na trenutnom veca od nultog
                max = cena;//azuriramo maximalnu vrednost
            }
        }

        System.out.println("Najskuplje piće košta: " + max + " dinara");
    }
}




















