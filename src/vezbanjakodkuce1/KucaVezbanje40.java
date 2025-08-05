package vezbanjakodkuce1;
//10. Napisati funkciju koja vraca najmanji element niza.
public class KucaVezbanje40 {
    public static int najmanjiElementNiza(int[]x){
        int min=x[0];
        for(int i=0;i<x.length;i++){
            if(x[i]<min){
                min=x[i];
            }

        }
        return min;
    }
    public static void main(String[]args){
        int[]niz={1,5,8,9,6,4,21};
        int najmanji=najmanjiElementNiza(niz);
        System.out.println("Najmanji element niza "+"" +"je" +""  +  najmanji);
    }
}
