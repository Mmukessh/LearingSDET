package OOPS;

public class Lab007_MethodOverriding {
    public static void main(String[] args) {

        TC1 t1=new TC1();
        t1.runTC1();

        TC2 t2=new TC2();
        t2.openBrowser();

        BaseTestCase b=new TC2();
        b.openBrowser();

    }
}

class BaseTestCase{
    void openBrowser()
    {
        System.out.println("Browser will open in 5 sec");
    }
}

class TC1 extends BaseTestCase
{
    void runTC1()
    {
        openBrowser();
    }
}

class TC2 extends BaseTestCase
{
    void openBrowser()
    {
        System.out.println("rowser will open in 2 sec");
    }
}