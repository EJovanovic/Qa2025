package vezbanjakodkuce1;

import java.util.Scanner;

public class KucaVezbanje {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Unesite svoje ime: ");
        String ime= sc.nextLine();
        System.out.println("Unesite broj godina: ");
        int brojGodina=sc.nextInt();
        final int Trenutna_godina=2025;
        int godiste= Trenutna_godina-brojGodina;
        System.out.println(ime + "Ti si rodjen/a "+ godiste+"godine");


    }
}
