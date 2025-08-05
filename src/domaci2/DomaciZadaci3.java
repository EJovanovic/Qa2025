package domaci2;

import java.util.Scanner;

public class DomaciZadaci3 {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Unesite broj1:");
    double broj1=sc.nextDouble();//korisnik unosi broj1
    System.out.println("Unesite broj2:");
    double broj2=sc.nextDouble();//korisnik unosi broj2
    while(broj2==0){
        System.out.println("Deljenje nulom nije dozvoljeno, unesite ponovo broj2");//petlja se ponavlja ako je broj nula
        broj2=sc.nextDouble();}//sve dok ne unese validan broj petlja se vrti
            double rezultat= broj1 / broj2;
            System.out.println("Rezultat deljenja je " + rezultat);

        }
        }








