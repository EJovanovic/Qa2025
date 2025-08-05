package cetvrtak1;

import java.util.Scanner;

public class VezbanjeNaCasu1 {
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        System.out.print("Unesite svoju visinu: ");
        int visina= sc.nextInt();
        System.out.println("Unesite svoje godine: ");
        int godine= sc.nextInt();
        if(godine>16 && visina>165){
            System.out.println("Mozete se voziti u luna parku "); }
        else {
            System.out.println("Ne mozete se voziti u luna parku");

        }
            }
        }



