package vezbanjakodkuce1;
// Napisati funkciju koja vraca zbir drugog najmanjeg i drugog najveceg elementa niza.

public class KucaVezbanje44 {
public static int  VratiZbirDrugogNajmanjegIDrugogNajvecegElementa(int []x){
    int min=x[0];
    int max=x[0];
    for(int i=0;i<x.length;i++) {
        if (x[i] > max) {
            max = x[i];
        }
        if (x[i] < min) {
            min = x[i];
        }
    }

    int drugiMax=x[1];
    int drugiMin=x[x.length-1];
    for(int i=0;i<x.length;i++) {
        if (x[i] != min && x[i] < drugiMin) {
            drugiMin = x[i];
        }
        if (x[i] != max && x[i] > drugiMax) {
            drugiMax = x[i];
        }
    }
        return drugiMin+drugiMax;

        }
        public static void main(String[]args){
    int []arr={2,4,5,1,5,8};
    for(int i=0;i<arr.length;i++){
        int rezultat=VratiZbirDrugogNajmanjegIDrugogNajvecegElementa(arr);
        System.out.println("drugi najveci i drugi najmanji su: "+ rezultat);
    }
        }

    }


