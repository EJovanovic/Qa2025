package vezbanjakodkuce1;

import java.util.Scanner;

public class KucaVezbanje10 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite prvi broj: ");
        int a= sc.nextInt();
        System.out.println("Unesite drugi broj: ");
        int b= sc.nextInt();
        System.out.println("Unesite treci broj: ");
        int c=sc.nextInt();
        if(a==b && b==c){
            System.out.println("Brojevi su jednaki" + a);
        }else if(a==b && a>c) {
            System.out.println("Prvi i drugi broj su jednaki i najveci" + a);
        } else if(a==c && a>b) {
            System.out.println("Prvi i treci su jednaki i najveci" +a );
        }
        else if(b==c && b>a){
            System.out.println("Drugi i treci su jednaki i najveci" + b);}
            else {
                int max=a;
                if(b>max) {
                    max = b;
                }
                if(c>max) {
                    max = c;
                }
                System.out.println("Najveci broj je"+ max);

            }

        }


    }

