package vezbanjakodkuce1;

import java.util.Scanner;

public class KucaVezbanje28 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite svoje ima : ");
        String ime= sc.next();
        System.out.println("Unesite svoje prezime ");
        String prezime=sc.next();
        System.out.println("Unesite godinu rodjenja: ");
        int godina= sc.nextInt();
        int trenutnaGodina= 2023- godina;
        int razred=trenutnaGodina-godina-6;
        if(razred<1) {
            System.out.println(ime+   ""    + prezime+""+ "treba da zapocne obrazovanje");
        } else if(razred>12) {
            System.out.println(ime+""+prezime+ "je zavrsio skolu");

        } else {
            System.out.println(ime+"Dobrodosao/la  u " + razred + "razred " + "" + ime + "" + prezime);

            


        }


    }
}
