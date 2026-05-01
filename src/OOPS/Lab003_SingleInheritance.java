package OOPS;

public class Lab003_SingleInheritance {
    public static void main(String[] args) {

        son s= new son();

        System.out.println(s.gold);
        s.BHK2();
        s.BHK3();
    }
}

class Father{
    int gold=1000;

    void BHK2()
    {
        System.out.println("Father 2 BHK");
    }
}

class son extends Father{

    void BHK3()
    {
        System.out.println("Son 3 BHK");
    }
}
