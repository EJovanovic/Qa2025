package nedeljaV;

import java.util.Scanner;

public class DomaciZadatakBrojDva {
    public static void main(String[] args) {
        Scanner sken = new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
        double broj1 = sken.nextDouble();
        System.out.print("Unesite drugi broj: ");
        double broj2 = sken.nextDouble();
        System.out.print("Unesite znak operacije (+ ili -):");
        char operacija = sken.next().charAt(0);
        if (operacija == '+') {
            System.out.println("Rezultat je :" + (broj1 + broj2));//ispisuje zbir brojeva
        } else if (operacija == '-') {
            System.out.println("Rezultat je " + (broj1 - broj2));//ispisuje razliku brojeva
        }
        else{
            System.out.println("Uneli ste nevalidan znak operacije ");//ukoliko korisnik unese znak koji nije ni minus ni plus

        }

    }
}

