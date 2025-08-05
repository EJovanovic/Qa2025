package Java1;
// 1. Napisati program koji ispisuje sve parne brojeve od 1 do 100

import java.util.Scanner;

public class JavaJava9 {
    public static void ispisiParneBrojeve() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }



