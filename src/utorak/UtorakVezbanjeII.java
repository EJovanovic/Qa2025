package utorak;

import java.util.Scanner;

public class UtorakVezbanjeII {
    public static int proizvodBrojeva(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite n broj: ");
        int n= sc.nextInt();//korisnik unosi broj preko skenera
        int proizvod=1; // inicijalizujemo proizvod na 1 jer necemo mnoziti sa nulom
        for(int i=1;i<=n;i++){
            System.out.println("Unesite broj" + i);
            int broj= sc.nextInt();//napravili smo petlju i sad korisnik unosi brojeve
            proizvod*=broj;//proizvod dobijamo tako sto mnozimo sa brojem

        }
        return proizvod;

    }
    public static void main(String[]args){
        int rezultat=proizvodBrojeva();
        System.out.println("Proizvod unetih brojeva je:" + rezultat);


    }


}
