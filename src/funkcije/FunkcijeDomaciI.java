package funkcije;

import java.util.Scanner;

public class FunkcijeDomaciI {
    public static int sumaBroja(int n) {
      int suma=0;
      for(int i=1;i<=n;i++){
          suma+=i;

        }
        return suma;


    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
      System.out.println("Unesite broj: ");
      int n= sc.nextInt();
      int rezultat=sumaBroja(n);
      System.out.println("Suma od 1 do " + n + " je: " + rezultat);


    }
}



