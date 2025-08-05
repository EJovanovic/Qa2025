package vezbanjakodkuce1;

import java.util.Scanner;

public class KucaVezbanje6 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite svoje godine: ");
        int brojGodina = sc.nextInt();
        System.out.print("Unesite svoju visinu");
        int visina = sc.nextInt();
        if (brojGodina > 16 && visina > 165) {
            System.out.println("Mozete se voziti u luna parku ");
        } else{
                System.out.println("Ne mozete se voziti u luna parku");
            }
        }
    }

