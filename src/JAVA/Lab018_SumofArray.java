package JAVA;

public class Lab018_SumofArray {
    public static void main(String[] args) {

        int a[]={3,7,6};
        int sumofValue=sum(a);
        System.out.println(sumofValue);
    }

    public static int sum(int a[])
    {
        int sum=0;

        for (int i = 0; i <a.length ; i++) {
            sum=sum+a[i];
        }
        return sum;
    }
}
