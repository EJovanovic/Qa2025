package nedeljaV;

import java.util.Scanner;

public class DomaciZadatakBrojJedan {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Unesite broj poena od 0 do 100: ");
            int poeni = sc.nextInt();
            if (poeni >= 0 && poeni < 51) {
                System.out.println("Broj poena je nedovoljan za polaganje ispita ");
            } else if (poeni >= 51 && poeni <= 60) {
                System.out.println("Vasa ocena je 6 ");
            } else if (poeni >= 61 && poeni <= 70) {
                System.out.println("Vasa ocena je 7 ");
            } else if (poeni >= 71 && poeni <= 80) {
                System.out.println("Vasa ocena je 8 ");
            } else if (poeni >= 81 && poeni <= 90) {
                System.out.println("Vasa ocena je 9");
            } else if (poeni >= 91 && poeni <= 100) {
                System.out.println("Vasa ocena je 10");
            }
            else{
                System.out.println("Uneli ste broj poena van opsega");//ukoliko korisnik unese broj poena koji nisu od 0 do 100
            }

        }
    }

