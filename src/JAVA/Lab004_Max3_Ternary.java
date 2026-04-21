package JAVA;

public class Lab004_Max3_Ternary {
    public static void main(String[] args) {

        int n1=9;
        int n2=18;
        int n3=25;

        String result= (n1>n2)?((n1>n3)?"n1":"n3"):((n2>n3)?"n2":"n3");
        System.out.println(result);


    }
}
