package OOPS;

public class Lab015_throw {

    static void validateAge(int age) throws Exception {

            if (age <18) {
                try {
                    throw new Exception("Not less than 18");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }else {
                System.out.println("yrs");
            }



    }

    public static void main(String[] args) throws Exception {
        validateAge(19);
    }
}
