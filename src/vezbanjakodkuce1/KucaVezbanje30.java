package vezbanjakodkuce1;

import java.util.Scanner;
//. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati taj niz u obrtnutom redosledu
public class KucaVezbanje30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj" + (i + 1));
            arr[i] = sc.nextInt();

        }
        ispisiObrnutiRedosled(arr);
    }

    public static void ispisiObrnutiRedosled(int[] niz) {
        for (int i = niz.length - 1; i >= 0; i--) {
            System.out.println(niz[i]);
        }


    }
}











