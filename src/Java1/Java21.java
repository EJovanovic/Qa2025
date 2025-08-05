package Java1;

import java.util.Scanner;

/*Korisnik unosi koliko pića želi da kupi za žurku . Zatim unosi cenu svakog pića
Program na kraju ispisuje:
(1) ukupnu cenu svih pića i poruku:
ako je ukupna cena veća od 5000 dinara → "Previše trosiš!"
ako je cena između 2000 i 5000 dinara → "Može proći."
ako je cena manja od 2000 dinara → "Skromna žurka, ali OK!"
(2) Takodje, ispisati cenu najskupljeg pića. */
public class Java21 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite kolicinu pica:");
        int kolicina=sc.nextInt();
        int[]cena=new int[kolicina];
        int UkupnaCena =0;
        for(int i=0;i<kolicina;i++){
            System.out.println("Unesite cenu pica: ");
            cena[i]= sc.nextInt();
            UkupnaCena+=cena[i];


        }

    }


}
