package Java1;

import java.util.Scanner;

//2. -//- i zati 2n celih brojeva. Prvih n brojeva smestiti u jedan niz a
// drugih n brojeva smestiti u drugi niz. Izracunati sume tih nizova.
public class JavaJava18 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int[] niz1=new int[x];//kreiranje dva niza sa po x elemenata
        int[] niz2=new int[x];
        int Suma1=0;
        int suma2=0;
        for(int i=0;i<x;i++) {//prolazimo kroz prvi niz
            niz1[i] = sc.nextInt();//niz ovih elemenata unosim
        }
        for(int i=0;i<x;i++) {
            niz2[i] = sc.nextInt();//unosim elemente drugog niza kao korisnik
        }





        }
    }

}
