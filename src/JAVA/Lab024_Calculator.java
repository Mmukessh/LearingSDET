package JAVA;

import java.util.Scanner;

public class Lab024_Calculator {

    public static void main(String[] args) {

        int choice = 0;
        System.out.println("Welcome To Calculator !!!!");
        System.out.println("Please select below option to perform action");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your Choice--");

        if(sc.hasNextInt())
        {

             choice=sc.nextInt();
                if(choice>=6)
                {
                    System.out.println("Invalid Option");
                    System.exit(0);
                }

        }
        else {
            System.out.println("Invaid Entry. Only Integer Allowed");
            System.exit(0);
        }

        switch (choice){

            case 1:

            
        }
    }

    public static int sum(int a,int b)
    {
        return (a+b);
    }
}
