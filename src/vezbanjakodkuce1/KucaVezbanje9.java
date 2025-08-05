package vezbanjakodkuce1;

import java.util.Scanner;

public class KucaVezbanje9 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite ocenu od 6 do 10 ");
        int ocena= sc.nextInt();
        switch(ocena){
            case 6:
                System.out.println("Niste polozili ispit ");
                break;
            case 7:
            case 8:
            case 9:
            case 10:

                System.out.println("Polozili ste ispit");
                break;
            default:
                System.out.println("Uneta ocena nije u naznacenom opsegu ");
                break;


            }
        }

    }

