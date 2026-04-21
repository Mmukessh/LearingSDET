package JAVA;

public class Lab003_GradeCalculator {
    public static void main(String[] args) {
        int marks=90;

        String grade=(marks>=90)?"A":((marks>=80 && marks<=89)?"B":(marks>=70 && marks<=79)?"C":(marks>=60 && marks<=69)?"D":(marks>=0 && marks<=59)?"F":"Enter valid marks");
        System.out.println(grade);
    }
}
