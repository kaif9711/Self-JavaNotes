// total marks and percentage of 5 subjects`
import java.util.Scanner;

public class perct_5_subjects
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of science\n");
        int a = sc.nextInt();
        System.out.print("Enter marks of maths\n");
        int b = sc.nextInt();
        System.out.print("Enter marks of english\n");
        int c = sc.nextInt();
        System.out.print("Enter marks of hindi\n");
        int d = sc.nextInt();
        System.out.print("Enter marks of social science\n");
        int e = sc.nextInt();

        int sum_marks = a + b + c + d + e;
        double percentage = (sum_marks/500.0 * 100.0);

        System.out.printf("Total percentage is : %.2f%%", percentage);;


    }
}
