package OOPS;

public class lab006_MethodoverLoading {

    public static void main(String[] args) {

        lab006_MethodoverLoading m=new lab006_MethodoverLoading();
        int r=m.add(3,4);
        System.out.println(r);

        int r1=m.add(3,5,7);
        System.out.println(r1);


    }

    int add(int a,int b )
    {
        return a+b;
    }

    int add(int a,int b,int c)
    {
        return a+b+c;
    }
}
