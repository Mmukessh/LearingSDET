package OOPS;

public class Lab011_Statickeyword {
    public static void main(String[] args) {

        ATB a=new ATB("mukesh",39);
        a.display();

        ATB b =new ATB("guru",3);
        b.display();

        System.out.println(ATB.class_name);
    }
}

class ATB{

    String name;
    int age;
    static String class_name="ATB";

    public ATB(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display()
    {
        System.out.println(name+" "+age+" "+class_name);
    }
}