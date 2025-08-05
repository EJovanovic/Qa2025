package vezbanjakodkuce1;

import java.util.Scanner;
//4. -//-. Ispisati svaki treci element u obrnutom redosledu.
//Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2
//b) Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.
//
public class KucaVezbanje33 {

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: " + (i + 1));
            arr[i] = sc.nextInt();
        }
        IspisiSvakiTreciBroj(arr);

    }
        public static void IspisiSvakiTreciBroj(int[] x) {
            for (int i =x.length-1; i>=0; i -= 3) {//dakle ako idem od kraja uvek krece od length-1, idem do je i manje od nule
                System.out.println("Svaki treci unazad: " + x[i]);// ne zaboravi da dodas sta ispisuje

        }

    }
}

