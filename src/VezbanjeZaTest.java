import java.util.Scanner;
// Napisati program koji trazi od korisnika da unese niz celih brojeva, zatim vraca odgovor da li je
//veca apsolutna vrednost zbira pozitivnih brojeva ili apsolutna vrednost zbira negativnih brojeva.
public class VezbanjeZaTest {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj n:");
        int n = sc.nextInt();//korisnik unosi broj preko skenera
        int[] arr = new int[n];//pravim niz
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj:" + (i+1));
            arr[i] = sc.nextInt();//unosi se jedan po jedan broj u niz


        }
        String rezultat=KojaApsolutnaVrednostJeVeca(arr);
        System.out.println(rezultat);
    }
    public static String KojaApsolutnaVrednostJeVeca(int[]x) {
        int ZbirPozitivnih = 0;//inicijalizovan zbir pozitivnih na nulu
        int ZbirNegativnih = 0;//isto tako i razlika
        //prolazimo kroz sve elemente niza
        for (int i = 0; i < x.length; i++) {
            if (x[i] > 0) {
                ZbirPozitivnih += x[i];
            } else if (x[i] < 0) {
                ZbirNegativnih += Math.abs(x[i]);


            }
        }
        if (Math.abs(ZbirPozitivnih) > Math.abs(ZbirNegativnih)) {
            return "Apsolutna Vrednost Pozitivnih brojeva je veca";
        } else if (Math.abs(ZbirPozitivnih) < Math.abs(ZbirNegativnih)) {
            return "Apsolutna vrednost negativnih brojeva je veca";
        }
        else{
            return "Vrednosti su jednake";


        }


    }
    }

