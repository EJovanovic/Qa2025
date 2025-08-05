package vezbanjakodkuce1;

import java.util.Scanner;

public class KucaVezbanje35 {
    public static int PomnoziBrojeve(int a,int b,int c){
        return a*b*c;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Broj 1: ");
        int broj1= sc.nextInt();
        System.out.println("Broj 2:");
        int broj2= sc.nextInt();
        System.out.println("Broj 3: ");
        int broj3= sc.nextInt();
        int rezultat=PomnoziBrojeve(broj1,broj2,broj3);
        System.out.println("Proizvod brojeva je: " + rezultat);



    }
}
