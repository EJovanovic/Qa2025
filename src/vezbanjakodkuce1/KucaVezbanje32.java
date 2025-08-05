package vezbanjakodkuce1;

import java.util.Scanner;
//3. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Izracunati sumu tog niza.
//Primer: [1, 2, 3, 4, 5] -> 15 (1 + 2 + 3 + 4 + 5 = 15)
//b) Napraviti funkciju koja vraca sumu prosledjenog niza.
public class KucaVezbanje32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//kreiramo skener zbog unosa korisnika
        System.out.println("Unesite broj elemenata niza: ");//trazi od korisnika da unese broj
        int n = sc.nextInt();//korisnik unosi broj//korisnik unosi broj
        int suma = 0;//suma na pocetku mora biti nula
        int[] arr = new int[n];//pravim niz duzine n
        //petlja za unos brojeva u niz, gde se unosi svaki element niza

        for (int i = 0; i < n; i++) {// pocetna vrednost je nula, i ona ide do n i dodaje jedan po jedan broj
            System.out.println("Unesite broj:" + (i + 1));//korisniku dajemo poruku da unese svaki broj jedan po jedan
            arr[i]=sc.nextInt();//korisnik unosi broj koji se smesta u niz
        }
        int rezultat = OdrediSumu(arr);
        System.out.println("Suma brojeva je " +  rezultat);

    }
//funkcija koja racuna sumu svih brojeva niza, parametar x je niz ciji ce se elementi sabrati
    public static int OdrediSumu(int[] x) {//naziv promenljive je x
        int suma = 0;//inicijalizujem sumu na nulu
        for (int i = 0; i < x.length; i++) {//racuna sumu celog niza
            suma += x[i];

        }
        return suma;//nikako ne smem da zaboravim!

    }
}








