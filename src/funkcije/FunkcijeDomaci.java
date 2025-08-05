package funkcije;

import java.util.Scanner;

public class FunkcijeDomaci {
    public static void obrnutiRedosledBrojeva (int[]arr) {
        for (int i = arr.length - 1; i >= 0; i--) {//ispisuje obrnuti redosled
            System.out.println(arr[i]);
        }

    }
    public static void main(String[]rgs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj n : ");
        int n = sc.nextInt();//korisnik unosi broj
        int[] arr = new int[n];//pravljenje niza
        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj " +  (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        obrnutiRedosledBrojeva(arr);


    }
}
