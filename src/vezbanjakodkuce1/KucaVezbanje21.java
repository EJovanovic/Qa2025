package vezbanjakodkuce1;

import java.util.Scanner;

public class KucaVezbanje21 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite prvi broj: ");
        int x = sc.nextInt();
        System.out.println("Unesite drugi broj: ");
        int y = sc.nextInt();
        if ((x < 0 && y < 0) || (x > 0 && y > 0) || (x == 0 && y == 0))
        {
            System.out.println("Brojevi su istog znaka ");

        } else{
            System.out.println("Brojevi su razlicitog znaka");

        }

    }
}
