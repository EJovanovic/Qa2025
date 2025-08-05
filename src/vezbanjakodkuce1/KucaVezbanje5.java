package vezbanjakodkuce1;

import java.util.Scanner;

public class KucaVezbanje5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int broj= sc.nextInt();
        if(broj % 3==0){
            System.out.println("Uneli ste broj deljiv sa tri");


        }
    }

}
