package domaci2;

import java.util.Scanner;

public class DomaciZadaci2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// unos lozinke od strane korisnika
        String ispravnaLozinka = "123medina";// unapred postavljena lozinka
        String unetaLozinka;
        do {
            System.out.println("Unesite lozinku: ");
            unetaLozinka = sc.next();
            if (!unetaLozinka.equals(ispravnaLozinka)) {
                System.out.println("Uneli ste pogresnu lozinku, pokusajte ponovo:");
            }
        } while (!unetaLozinka.equals(ispravnaLozinka));// uslov za ponavljanje dok lozinka nije tacna
         {


        }
    }
    }













