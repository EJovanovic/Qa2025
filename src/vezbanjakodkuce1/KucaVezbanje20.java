package vezbanjakodkuce1;

import java.util.Scanner;

public class KucaVezbanje20 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite broj1: ");
        int broj1= sc.nextInt();
        System.out.println("Unesite broj2: ");
        int broj2= sc.nextInt();
        int a= broj1+broj2;
        int b=broj1-broj2;
        int c=broj1*broj2;
        double d=broj1/broj2;
        int t=broj1%broj2;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(t);



    }
}
