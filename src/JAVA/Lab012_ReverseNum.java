package JAVA;

import java.util.Scanner;

public class Lab012_ReverseNum {
    public static void main(String[] args) {

        int digit,rev=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numer to reverse");
        int num=sc.nextInt();

        while (num!=0){

            digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        System.out.println("Reverse number is = "+rev);
    }
}
