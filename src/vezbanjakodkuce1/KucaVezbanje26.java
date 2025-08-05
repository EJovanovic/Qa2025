package vezbanjakodkuce1;

import java.util.Scanner;

public class KucaVezbanje26 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int n= sc.nextInt();
        long proizvod=1;
        for(int i=1;i<=n;i++){
            proizvod=proizvod*i;
            System.out.println("Rezultat  "+ proizvod);


        }

    }
}
