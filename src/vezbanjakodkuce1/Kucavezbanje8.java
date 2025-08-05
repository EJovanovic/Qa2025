package vezbanjakodkuce1;

import java.util.Scanner;

public class Kucavezbanje8 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Unesite ocenu od 6 do 10: ");
        int ocena= sc.nextInt();
        if(ocena==6){
            System.out.println("Niste polozili ispit");}
        else if(ocena>=7 && ocena<=10) {
            System.out.println("Polozili ste ispit ");
        }
        else{
            System.out.println("Uneta ocena nije u opsegu ");

        }
    }
}
