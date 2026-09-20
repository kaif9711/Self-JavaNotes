public class average_salary
{
    public static void main(String[] args){
        int[] salaries = {25000, 32000, 28000, 45000, 38000};
        int lenght = salaries.length;
        int sum =0;
        for(int x:salaries){
            sum = sum + x;

        }
        System.out.println("Total sum is" + sum);
        int avg = sum/lenght;

        System.out .println("Average is " + avg);

    }
}
