package vezbanjakodkuce1;

import javax.xml.transform.Source;
import java.util.Scanner;

public class KucaVezbanje22 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite cetvorocifren broj");
        int x= sc.nextInt();
        if(x>=1000 && x<=9999) {
            int cifra1=x/1000;
            int cifra2=(x/100)%10;
            int cifra3=(x/10)%10;
            int cifra4=(x%10);
            int proizvod= cifra1*cifra2;
            int zbir=cifra3+cifra4;
            int razlika= proizvod-zbir;
            System.out.println("Rezultat  " +  razlika);
        } else{
            System.out.println("Broj koji ste uneli nije cetvorocifren");}





        }

    }


