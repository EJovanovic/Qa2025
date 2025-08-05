package vezbanjakodkuce1;

import java.util.Scanner;

public class KucaVezbanje17 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<1){
            System.out.print("Broj mora biti veci od nule");}
        else{
           int proizvod=1;

        for(int i=1;i<=n;i++){
            proizvod=proizvod*i;}

            System.out.print("Proizvod brojeva od 1 do"   + n+  "je"+proizvod);}

    }

}
