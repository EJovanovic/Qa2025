package Java1;

import java.util.Scanner;

public class JavaJava2 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite broj");
        int n= sc.nextInt();
        int[] nizJedan= new int[n];
        int[] nizDva= new int[n];
        int sumaNiz1=0;
        int sumaNiz2=0;
        for(int i=0;i<n;i++) {
            nizJedan[i] = sc.nextInt();
            sumaNiz1 += nizJedan[i];
        } for(int i=0;i<n;i++){
            nizDva[i]= sc.nextInt();
            sumaNiz2+=nizDva[i];
            System.out.println("Suma prvog niza" + sumaNiz1);
            System.out.println("Suma drugog niza" + sumaNiz2);





        }


    }
}
