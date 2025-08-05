package javafunkcije;

import java.util.Scanner;

public class funkcijeJave {
public static void UpisiBroj(){
Scanner sc=new Scanner(System.in);
System.out.println("Unesite broj:");
int n= sc.nextInt();
int[]arr=new int[n];
for(int i=0;i<n;i++){
    System.out.println("Unesite broj"+ (i+1));
    arr[i]= sc.nextInt();
}
for(int i=n-1;i>=0;i--){
    System.out.println(i);

}
}
public static void main(String[]args){
    UpisiBroj();
}
}