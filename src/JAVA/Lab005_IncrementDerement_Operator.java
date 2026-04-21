package JAVA;

public class Lab005_IncrementDerement_Operator {

    public static void main(String[] args) {

        int a=10;
        System.out.println(++a + a++ + a++);// 11+11+12
        System.out.println(a);

        System.out.println(--a +a++ +a--);// 12+12+13
        System.out.println(a);
    }
}
