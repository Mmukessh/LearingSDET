package JAVA;

public class Lab017_MaxElement {
    public static void main(String[] args) {
        int a[]={6,8,9};


        int maxValue=max(a);
        System.out.println(maxValue);

    }

    public static int max(int a[])
    {
        int max=a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i])
            {
                max=a[i];
            }
        }
        return max;
    }
}
