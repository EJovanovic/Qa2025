package Java1;

import java.util.Scanner;

//6. Korisnik unosi koliko artikala zeli da kupi a zatim i cenu tih artikala. Nakon toga, korisnik unosi koliko kupona ima (moze da se desi da korisnik nema ni jedan kupon), a zatim i iznos svakog kupona.
// Svaki kupon umanjuje ukupnu cenu svih artikala za svoj iznos.
// Ispisati krajnu svotu koju korisnik mora da plati. Ukoliko ima dovoljno kupona da dobije sve artikle besplatno,
// ispisati 0.0. Prodavnica ne daje ni ukom slucaju pare korisniku!
public class JavaJava20 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();//ovde smo vec rekli koliko zelimo artikala
        int[] artikal=new int[n];
        int []cena=new int[n];
        for(int i=0;i<n;i++) {
            System.out.println("Unesite cenu artikala: ");
            cena[i] = sc.nextInt();
        }
        System.out.println("Unesite broj kupona:");
        int brojKupona=sc.nextInt();
        int ukupniPopust=0;
        //ukupan iznos kupona
        for(int i=0;i<brojKupona;i++) {
            System.out.println("unesite iznos kupona" + (i + 1));
            int kupon = sc.nextInt();
        }
            ukupniPopust+=kupon;//dodajemo ukupni iznos na iznos kupona
             //izracunavanje cene svih artikala
            int ukupnaCena=0;
            for(int i=0;i<n;i++){

            }


        }
    }
}
