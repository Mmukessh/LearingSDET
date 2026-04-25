package JAVA;

public class Lab010_Functions {

    public static void main(String[] args) {
        hello();
        int age=age();
        System.out.println("my age is"+age);
        detailds("mukesh",40);
        int sum = sum(3,4);
        System.out.println(sum);
    }

    public static void hello()
    {
        System.out.println("Wothout parameter and return type");
    }

    public static int age()
    {
        System.out.println("without parameter with return type");
        return 18;
    }

    public static void detailds(String name,int age)
    {
        System.out.println("with parameter without return type   " +name+" "+age);
    }

    public static int sum(int a,int b)
    {
        return (a+b);
    }
}
