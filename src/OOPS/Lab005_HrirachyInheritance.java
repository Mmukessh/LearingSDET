package OOPS;

public class Lab005_HrirachyInheritance {

    public static void main(String[] args) {

        son_HI s=new son_HI();
        daughter_HI d= new daughter_HI();
        father_HI f =new father_HI();

        s.son();
        s.home();

        d.daughter();
        d.home();

        f.home();

    }
}

class father_HI{
    void home()
    {
        System.out.println("Father home");
    }
}

class son_HI extends father_HI
{
    void son()
    {
        System.out.println("son home");
    }
}

class daughter_HI extends father_HI
{
    void daughter()
    {
        System.out.println("daughter homs");
    }
}