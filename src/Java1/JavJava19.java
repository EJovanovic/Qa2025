package Java1;

import java.util.Scanner;

//5. Korisnik unosi broj zakljucenih ocena djaka i zatim unosi te ocene. Ispisati odgovarajucu poruku: "Odlican", "vrlo dobar", "dobar", "dovoljan", "nedovoljan" u zavisnosti od ocena djaka.
// Ukoliko djak ima barem jednu jedinicu, smatrati da je "nedovoljan".
public class JavJava19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj ocena:");
        int n = sc.nextInt();  // Broj ocenaa to je broj koji ce korisnik uneti koliko ocena zeli da unese
        int[] ocene = new int[n]; // Niz u kojem ćemo čuvati ocene pravim niz

        // Pozivamo funkciju koja unosi i proverava ocene
        unosIOcjena(ocene, sc);
    }

    // Funkcija za unos i proveru ocjena
    public static void unosIOcjena(int[] ocene, Scanner sc) {
        // Unos ocjena
        for (int i = 0; i < ocene.length; i++) {
            System.out.println("Unesite " + (i + 1) + ". ocenu:");
            ocene[i] = sc.nextInt(); // Unos ocene
        }

        // Provera da li je bilo "nedovoljan" (ocena 1)
        for (int i = 0; i < ocene.length; i++) {
            if (ocene[i] == 1) {
                System.out.println("Nedovoljan"); // Ispisuje poruku ako je ocena 1
                return; // Prekida funkciju, jer je djak nedovoljan
            }
        }

        // Ako nije bilo "nedovoljan", ispisuje poruku
        System.out.println("Svi su prosli");
    }
}
