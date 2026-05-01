package OOPS;

public class Lab004_MultilevelInheritance {

    public static void main(String[] args) {

        son1 s1 = new son1();
        s1.bhk();
        s1.farm();
        s1.bhk2();
        s1.bhk3();
        System.out.println("----------------");
        father f=new father();
        f.bhk();
        f.farm();
        f.bhk2();
        System.out.println("---------------");
        grandFather g=new grandFather();
        g.bhk();
        g.farm();    }
}

class grandFather
{
    void bhk()
    {
        System.out.println("Granfather house");
    }

    void farm()
    {
        System.out.println("Grandfather farm");
    }

}

class father extends grandFather
{
    void bhk2()
    {
        System.out.println("father 2 bhk");
    }
}

class son1 extends father
{
    void bhk3()
    {
        System.out.println("son 3 bhk");
    }
}
