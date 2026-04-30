package OOPS;

public class Lab001_Class {
    public static void main(String[] args) {

        person p =new person();
        p.name="Mukesh";
        p.address="Mumbai";
        p.mobile=987654321;


        System.out.println(p.name);
        System.out.println(p.address);
        System.out.println(p.mobile);

        p.speak();

    }
}

class person {

    String name;
    String address;
    long mobile;
    String gender;

    void speak()
    {
        System.out.println("speaking !!!!");

    }


}

