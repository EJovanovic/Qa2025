package vezbanjakodkuce1;

import java.util.Scanner;

public class KucaVezbanje23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("Unesite pozitivan broj: ");
        int n = sc.nextInt();
        if (n > 0) {
            for (i = 0; i <= n; i++) {
                System.out.println(i);
            }


        } else {
            System.out.println("Greska,broj mora biti pozitivan");


        }
    }
}
