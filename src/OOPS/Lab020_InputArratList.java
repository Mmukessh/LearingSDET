package OOPS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab020_InputArratList {
    public static void main(String[] args) {

        List<String> names=new ArrayList<>();
        List<Integer> ages=new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        String continueInput="Y";
        while (continueInput.equalsIgnoreCase("Y"))
        {
            System.out.println("Please enter name");
            String name=sc.nextLine();
            names.add(name);

            System.out.println("Enter age");
            int age=sc.nextInt();
            ages.add(age);

            sc.nextLine();
            System.out.println("Do you want to enter more record--");
            continueInput=sc.nextLine();

        }

        for(Object o:names)
        {
            System.out.println(o);
        }
        for (Object o1:ages)
        {
            System.out.println(o1);
        }
    }
}
