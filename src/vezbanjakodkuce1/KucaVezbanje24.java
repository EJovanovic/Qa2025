package vezbanjakodkuce1;

import java.util.Scanner;

public class KucaVezbanje24 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.print("Unesite negativan broj: ");
        int n= sc.nextInt();
        if(n<0) {
            for (i = n; i <= 0; i++) {
                System.out.println("i");
            }
        }else{
            System.out.println("Greska unesite ponovo broj: ");

        }
    }
}
