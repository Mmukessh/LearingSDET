package JAVA;

import java.util.Scanner;

public class Lab011_Calculator {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int a=0;
        int b=0;
        System.out.println("Enter value of a");
        if(sc.hasNextInt())
        {
            a= sc.nextInt();
        }
        else {
            System.out.println("Only integer allowed");
            System.exit(0);
        }

        System.out.println("Enter value of b");

        if(sc.hasNextInt())
        {
            b= sc.nextInt();
        }
        else {
            System.out.println("Only integer allowed");
            System.exit(0);
        }

        int result_sum=sum(a,b);
        System.out.println("Sum is = "+result_sum);
        int result_sub=sub(a,b);
        System.out.println("Subtraction is = "+result_sub);
        int result_div=div(a,b);
        System.out.println("Division is = "+result_div);
        int result_mul=mul(a,b);
        System.out.println("Multiplicztion is = "+result_mul);
        int result_mod=mod(a,b);
        System.out.println("Modulus is = "+result_mod);



    }

    public static int sum(int a,int b)
    {
        return (a+b);
    }

    public static int sub(int a,int b)
    {
        return (a-b);
    }

    public static int div(int a, int b)
    {
        if(b==0)
        {
            System.out.println("Divide by zero not possible");
        }
        return (a/b);
    }

    public static int mul(int a, int b)
    {
        return (a*b);
    }

    public static int mod(int a,int b)
    {
        return (a%b);
    }
}
