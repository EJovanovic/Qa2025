package Java1;

import java.util.Scanner;

public class JavaJedan {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int n= sc.nextInt();
        int[]niz=new int[n];
        int suma=0;
        int proizvod=1;
        System.out.println("Unesite" + "" +n+ "celih brojeva");
        for(int i=0;i<n;i++) {
            niz[i] = sc.nextInt();
            suma += niz[i];
            proizvod *= niz[i];
        }
            System.out.println("Suma brojeva niza"  + suma);
        System.out.println("Proizvod brojeva niza" + proizvod);

        }

    }

