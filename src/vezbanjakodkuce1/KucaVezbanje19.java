package vezbanjakodkuce1;

import java.util.Scanner;

public class KucaVezbanje19 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("Uneti broj je pozitivan");
        }
        else if(n<0) {
            System.out.println("Uneti broj je negativan");
        }
        else{
            System.out.println("Broj je nula");

            }
        }
    }

