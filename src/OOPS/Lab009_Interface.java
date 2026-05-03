package OOPS;

public class Lab009_Interface {
    public static void main(String[] args) {
        tata t =new tata();
        t.drive1();
    }
}

class tata implements engine1,break1{

    @Override
    public void start() {
        System.out.println("Start");
    }

    @Override
    public void apply() {
        System.out.println("apply");
    }

    void drive1(){
        start();
        System.out.println("drive");
        apply();
    }
}

interface engine1{
    void start();
}

interface break1{
            void apply();
        }