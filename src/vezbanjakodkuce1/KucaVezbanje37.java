package vezbanjakodkuce1;

import java.util.Scanner;

public class KucaVezbanje37 {

    public static void main(String[]args) {
        int[] niz = {2, 5, 7, 8, 1, 2};

        ispisiNeparneBrojeve(niz);
    }
    public static void ispisiNeparneBrojeve(int []x){
        for(int i=0;i<x.length;i++){
            if(x[i]%2!=0){
                System.out.println(x[i]);

            }
        }
    }
}
