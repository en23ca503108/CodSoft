import java.util.Scanner;

public class Student_grade_calculator {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int Physics, Chemistry, Maths, Hindi, English;
        int total;
        float res;
        String grade;
        System.out.print("ENTER MARKS OUT OF 100: \n\n");
        System.out.print("Physics: ");
        Physics=sc.nextInt();
        System.out.print("Chemistry: ");
        Chemistry=sc.nextInt();
        System.out.print("Maths: ");
        Maths=sc.nextInt();
        System.out.print("Hindi: ");
        Hindi=sc.nextInt();
        System.out.print("English: ");
        English=sc.nextInt();


        total=Physics+Chemistry+Maths+Hindi+English;
        res=total/5;

        if (res >= 90)
            grade="A+";
        else if (res >=80 && res<=90)
            grade="A";
        else if (res>=70 && res<=80)
            grade="B";
        else if(res>=60 && res<=70)
            grade="C";
        else
            grade="D";

        System.out.println("\nTotal marks: "+total);
        System.out.println("Average percentage: "+res);
        System.out.println("Grade: "+grade);
    }
}