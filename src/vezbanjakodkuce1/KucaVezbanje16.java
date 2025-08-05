package vezbanjakodkuce1;

import java.util.Scanner;

public class KucaVezbanje16 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int n= sc.nextInt();
        int i;
        for( i=n;i>=-n;i--){
            System.out.println(i);

        }
    }
}
