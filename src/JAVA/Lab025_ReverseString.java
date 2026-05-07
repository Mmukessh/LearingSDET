package JAVA;

import java.util.Scanner;

public class Lab025_ReverseString {
    public static void main(String[] args) {
        // This programm allow to reverse only for one word
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter string to Reverse==");
        String string=sc.nextLine();
       String reverseString= reverseString(string);
        System.out.println(reverseString);

        String reverseLine=reverseStringLine(string);
        System.out.println(reverseLine);

        reverseWords(string);




    }
    public static String reverseString(String str)
    {
        String reverse="";

        for (int i = str.length()-1; i >0 ; i--) {
            reverse=reverse+str.charAt(i);
        }

        return reverse;
    }

    public static String reverseStringLine(String str)
    {
        String reverseLine="";
        String[] arr = str.split(" ");
        int length = arr.length;

        for (int i = 0; i<arr.length ; i++) {

            String word =arr[i];
            for (int j = word.length()-1; j >=0 ; j--) {
                reverseLine=reverseLine+word.charAt(j);
            }
            reverseLine=reverseLine+" ";

        }

        return reverseLine.trim();
    }

    public static String reverseWords(String str)
    {
        String reverse=" ";
        String arr[]=str.split(" ");
        int length =arr.length;
        System.out.println(length);

        for (int i = arr.length-1; i >=0 ; i--) {

            System.out.println(arr[i]);
        }
        return null;
    }

}


