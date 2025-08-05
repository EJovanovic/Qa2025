package Java1;
/*5. Napisati program koji od korisnika trazi da unese broj godina kao ceo pozitivan broj i visinu kao realan pozitivan broj. Ispisati poruku "Mozete se voziti u luna parku" ako je broj godina veci od 16 i visina veca od 170.0cm. Dozvoliti korisniku da unese podatke proizvoljnim redom. Zagarantovati ispravnost podataka.
// Ukoliko korisnik unese nesto sto nije ni ceo ni realan broj, zamoliti ga za ponovni unos
*/

import java.util.Scanner;

public class JavaJava14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int godine = 0;
        double visina = 0.0;
        while (godine <= 0 || visina <= 0) {//ponavljaj petlju dok bar jedno nije tacno
            System.out.println("Unesite podatak:Visina ili godine; ");
            if (sc.hasNext() && godine == 0) {//dok god korisnik ima neki unos
                godine = sc.nextInt();//ako upise 25 ti stavi kao godine
            } else if (sc.hasNextDouble() && visina == 0.0) {
                visina = sc.nextDouble();
            } else {
                sc.nextLine();//ocisti nevazeci unos
                System.out.println("neispravan unos.pokusaj ponovo");
            }
            if (godine > 16 && visina > 170.0) {
                System.out.println("Mozete se voziti u luna parku");
            } else {
                System.out.println("Ne mozete se voziti");
            }


        }

    }
}



