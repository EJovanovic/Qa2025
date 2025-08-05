package Java1;

import java.util.Scanner;

//3. Napisati program koji za uneti ceo broj n ispisuje brojeve:
//        *   a) [1, n]
public class JavaJava11 {
    public static void ispisiBrojeve(){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){//ako ide od 1 do n dakle i n ukljucujem
            System.out.println(i);
        }
    }

}
