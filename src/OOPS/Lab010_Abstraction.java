package OOPS;

public class Lab010_Abstraction {
    public static void main(String[] args) {
        Wagnor w =new Wagnor();
        w.drive();

    }
}
class Wagnor extends engine{
    @Override
    void start() {
        System.out.println("Start engine");
    }

    @Override
    void stop() {
        System.out.println("Stop engine");
    }

    void drive()
    {
        start();
        System.out.println("Driving");
        stop();
    }
}

abstract class engine
{
    abstract void start();
    abstract void stop();

}
