import java.util.Scanner;

public class Number_game {
    public static void main(String args[])
    {
        int number = 29;
        int guess_num,attempt=5;
        int score;
        Scanner sc=new Scanner(System.in);
        do {
            attempt-=1;
            System.out.print("\nEnter number from 1 to 100: ");
            guess_num = sc.nextInt();
            if (guess_num == number) {
                System.out.print("Correct Answer");
                if (attempt==4)
                    score=100;
                else if(attempt==3)
                    score=75;
                else if(attempt==2)
                    score=50;
                else
                    score=25;
                System.out.println("\nYour Score: "+score);
                break;
            }
            else if (guess_num>= number )
                System.out.print("\nToo high :) Try Again");
            else if (guess_num<=number)
                System.out.print("\nToo Low :) Try Again");
            else
                System.out.print("\nSorry :(");
            System.out.print("\n"+attempt+" attempt left\n");

        }while(attempt>0);
    }
}
