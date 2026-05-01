package OOPS;

public class Lab002_DefaultConstructor {
    public static void main(String[] args) {

        car c = new car();

        System.out.println(c.name+" "+c.model+" "+c.year);

        c.name="TATA";
        c.model="SAFARI";
        c.year=2026;
        System.out.println(c.name+" "+c.model+" "+c.year);

    }
}

class car
{
    String name;
    String model;
    int year;

    car() {
        name = "Default name";
        model = "Default model";
        year = 0;

        System.out.println("I m default constructor !!!!");
    }


}
