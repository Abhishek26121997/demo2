package demo2;
import java.util.Scanner;

public class Sum{
    public static void main(String [] args){
        int a=0, b=0, c=0, sum=0;
        System.out.println("Enter 3 numbers: ");

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        sum = a+b+c;

        System.out.println("The sum of trhee numbers is : "+sum);

        scanner.close();
        }
}