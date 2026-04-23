package JAVA;

public class Lab009_CountVowel {

    public static void main(String[] args) {

        String str="MUkesh".toLowerCase();


        int count=0;

        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if(ch=='a'|| ch=='u' || ch=='e' || ch=='o' ||ch=='i')
            {
                count++;
            }

        }
        System.out.println(count);
    }
}
