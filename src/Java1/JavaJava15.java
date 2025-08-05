package Java1;

import java.util.Scanner;

//1. Napisi program koji koristi do-while petlju da omoguci korisniku unos lozinke sve dok ne unese
//ispravnu lozinku. Ispravna lozinka moze biti unapred inicijalozovana.
public class JavaJava15 {
    public static void  main (String[]args){
        Scanner sc=new Scanner(System.in);
        String lozinka=sc.nextLine();
        String Ispravnalozinka="Medina";
        do{
            System.out.println("Unesite lozinku");
            lozinka= sc.nextLine();

        }while(!lozinka.equals(Ispravnalozinka));   //ide uzvicnik ispred jer sve dok je neispravna lozinka tj nije jednaka pravoj on ce da vrti petlju

    }
}
