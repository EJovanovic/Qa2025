package vezbanjakodkuce1;

import java.util.Scanner;

public class KucaVezbanje25 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Unesite broj:");
        int n = sc.nextInt();
        if (n > 0) {
            for (i = -14; i <= 2 * n; i++) ;
            System.out.println("i");
        }else{
            System.out.println("Uneli ste nepoznat broj");


        }
    }
}
