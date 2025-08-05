package Java1;

import java.util.Scanner;

public class JavaJava6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int visina = sc.nextInt();
        int godine = sc.nextInt();
        if (visina < 165 && godine > 18) {
            System.out.println("Mozete se voziti u luna parku");
        } else {
            System.out.println("Ne mozete se voziti u luna parku!");

        }
    }
}

