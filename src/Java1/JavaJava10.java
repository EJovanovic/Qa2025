package Java1;
//* 2. Napisati program koji ispisuje sve brojeve deljive sa 3 ili deljive sa 4 od 1 do 100
public class JavaJava10 {
    public static void ispisiSveBrojeve() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}


