package JAVA;

import java.util.Scanner;

public class Lab014_FibinacciSeries {

    public static void main(String[] args) {

        int a=0;
        int b=1;

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();

        System.out.print("Fibonacci sreies is== "+a + " "+b);
        for (int i = 0; i <=n ; i++) {

            int next=a+b;
            a=b;
            b=next;
            System.out.print(next);

        }
    }
}
