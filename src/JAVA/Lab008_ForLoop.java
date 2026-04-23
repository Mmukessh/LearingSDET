package JAVA;

public class Lab008_ForLoop {

    public static void main(String[] args) {

        for (int i = 0; i <25 ; i++) {
            if(i%2==0)
            {
                System.out.println("Even num"+i);
                continue;
            }
            System.out.println("odd num"+i);

        }
    }
}
