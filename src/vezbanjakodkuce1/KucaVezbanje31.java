package vezbanjakodkuce1;

import java.util.Scanner;

public class KucaVezbanje31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Unesite" + n + "brojeva");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        ispisSvakogDrugogBroja(arr);
    }
    public static void ispisSvakogDrugogBroja(int[] x) {
        for (int i = 0; i < x.length; i += 2) {
            System.out.println(x[i]);
        }
    }
}
