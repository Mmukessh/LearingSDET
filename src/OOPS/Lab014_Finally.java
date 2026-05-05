package OOPS;

import java.util.Scanner;

public class Lab014_Finally {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int v=sc.nextInt();

        try {
            int a=100/0;
        } catch (Exception e) {
            System.out.println(e.getMessage()+"noy possible");
        } finally {
            sc.close();
            System.out.println("Scanner closed");
        }
    }
}
