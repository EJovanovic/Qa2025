package vezbanjakodkuce1;

import java.util.Scanner;

public class KucaVezbanje18 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int n=sc.nextInt();
        if(n%2==0) {
            System.out.println("Uneti broj je paran");
        } else{
            System.out.println("Uneti broj je neparan");

        }
    }

}
