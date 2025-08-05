package Java1;

import java.util.Scanner;

//1. Korisnik unosi ceo pozitivan broj n a zatim i n celih brojeva.
// Smestiti te brojeve u niz i izracunati sumu i proizvod elemenata tog niza.
public class JavaJava17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Morate uneti pozitivan broj");

        }
    int[] niz=new int[n];
        System.out.println("Unesite " + n + "brojeva");
        for(int i=0;i<n;i++){
            System.out.println(niz[i]);
        }

}
/*U ovom slučaju, n nam zapravo daje broj elemenata koje želimo da unesemo u niz.
 Dakle, koristimo n da kreiramo niz i da unesemo podatke,
 dok niz.length koristimo samo kada želimo da iteriramo kroz postojeći niz koji već ima određeni broj elemenata.
 */