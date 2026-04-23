package JAVA;

import java.util.Scanner;

public class Lab007_SwitchCase {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter day number");
        int day = sc.nextInt();

        switch (day){

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wen");
                break;

            case 4:
                System.out.println("Thuresday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Dont know");
        }
    }
}
