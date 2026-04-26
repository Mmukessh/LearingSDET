package JAVA;

public class Lab015_String {
    public static void main(String[] args) {

        String s1="Mukesh";
        StringBuffer s2=new StringBuffer("Dhage");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.concat(" Dhage"));
        System.out.println(s1.length());

        for (int i = 0; i <s1.length() ; i++) {
            System.out.println(s1.charAt(i));
        }
    }
}
