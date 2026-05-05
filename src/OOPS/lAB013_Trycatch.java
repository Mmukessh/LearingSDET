package OOPS;

public class lAB013_Trycatch {
    public static void main(String[] args) {

        int a=100;

        try {
            int b=a/0;
        }catch (Exception e)
        {
            System.out.println("Divide by 0 not possible");
        }


        System.out.println("hii");


    }
}
