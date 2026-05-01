package OOPS;

import java.util.Scanner;

public class Lab003_ParameterizesConstructor {
    public static void main(String[] args) {

        car2 c2=new car2("mahindra",2026);
        System.out.println(c2.name+c2.year);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name --");
        String name=sc.next();

        System.out.println("Enter year--");
        int year = sc.nextInt();

        car2 c=new car2(name,year);

        System.out.println(name+year);

    }
}

class car2{

    String name;
    int year;

    car2()
    {
        System.out.println("Default constructor");
    }

    car2(String name,int year)
    {
        this.name=name;
        this.year=year;
    }
}
