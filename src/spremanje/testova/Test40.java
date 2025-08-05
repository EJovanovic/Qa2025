package spremanje.testova;

import java.util.Scanner;

/*. Napisati funkciju kreirajNiz, koja od korisnika prima unos celih brojeva sve dok korisnik ne unese broj 0. Vratiti niz tih unetih brojeva ne uzimajuci u obzir 0. Npr:
//Input: 1 2 3 4 4 2 -123 789 999 3 34 55 0
//Output: [1, 2, 3, 4, 4, 2, -123, 789, 999, 3, 34, 55]
//
//Input: 1 0
//Output: [1]
//
//Input: 0
*/
public class Test40 {
        public static int[] kreirajNiz() {
            public static int[] kreirajNiz() {
                Scanner sc = new Scanner(System.in);

                // Napravimo niz sa maksimalnim brojem elemenata (na primer, 100)
                int[] niz = new int[100];
                int brojUnesenih = 0;  // Varijabla koja prati koliko brojeva je korisnik uneo

                // Petlja koja traži od korisnika unos brojeva dok ne unese 0
                while (true) {
                    System.out.print("Unesite broj (0 za kraj): ");
                    int broj = sc.nextInt();  // Unos broja

                    if (broj == 0) {
                        break;  // Ako je broj 0, izlazimo iz petlje
                    }

                    // Dodajemo broj u niz na poziciju `brojUnesenih`
                    niz[brojUnesenih] = broj;
                    brojUnesenih++;  // Povećavamo broj unetih brojeva
                }