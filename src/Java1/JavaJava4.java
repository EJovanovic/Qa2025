package Java1;

import java.util.Scanner;

public class JavaJava4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int n= sc.nextInt();//korisnik unosi broj
        int[]arr=new int[n];//pravim niz, i u njega smestam n brojeve
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();// petlja, krece od nule to je pocetak, izvrsava se sve dok ne stigne do n i ide jedan po jedan
        }// stavljam i u niz jer krece od njega

            for(int x:arr){
                if(x%3==0 && x%6!=0){
                    System.out.println(x);

                }


        }

    }
}
