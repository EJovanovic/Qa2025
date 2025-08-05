package vezbanjakodkuce1;
//11. Napisati funkciju koja duplira sve elemente niza.
       // Primer: [1, 2, 3, 4, 5] -> [2, 4, 6, 8, 10]
public class KucaVezbanje41 {
    public static void DuplirajElemente(int[]x){
        for(int i=0;i<x.length;i++){
            x[i]=x[i]*2;// duplira svaki broj u nizu

        }

    }
    public static void main(String[]args){
        int []niz={1,2,4,5,6};
       DuplirajElemente(niz);
       for(int i=0;i< niz.length;i++){//ako zelim da proverim rezultat moram da unesem niz
           System.out.println(niz[i]);
       }




    }


}
