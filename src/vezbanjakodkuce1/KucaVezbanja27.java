package vezbanjakodkuce1;

import java.util.Scanner;

public class KucaVezbanja27 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Unesite mesec rodjenja: ");
        int mesec= sc.nextInt();
        System.out.println("Unesite dan rodjenja: ");
        int dan= sc.nextInt();
        if(mesec==3 && dan==21 || mesec==4 && dan==19)
        {
            System.out.println("Vas horoskopski znak je ovan");
        } else if((mesec==4 && dan==20) || (mesec==5 && dan==20)) {
            System.out.println("Vas horoskopski znak je bik ");
        }else if((mesec==5 && dan==21) || (mesec==6 && dan==20)) {
            System.out.println("Vas horoskopski znak je blizanac ");
        }else if((mesec==6 && dan==21) || (mesec==7 && dan==22)){
            System.out.print("Vas horoskopski znak je rak ");
            




            }

        }


    }

