package JAVA;

import java.util.Scanner;

public class Lab019_ArraySorting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size--");
        int size=sc.nextInt();

        int array[]=new int[size];
        for (int i = 0; i <size ; i++) {

            System.out.println("Enter element");
            array[i]=sc.nextInt();
        }
        System.out.println("Array is--- ");
        for (int j = 0; j <size ; j++) {

            System.out.print(array[j]);
        }

        int sortArray[]=sort(array);
        System.out.println("Sorted Array is--- ");
        for (int j = 0; j <sortArray.length ; j++) {

            System.out.print(array[j]);
        }

    }

    public static int[] sort(int a[])
    {
        for (int i = 0; i <a.length-1 ; i++) {
            for(int j=0;j<a.length-1-i;j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }
}
