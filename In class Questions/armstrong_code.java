import java.util.Scanner;

public class armstrong_code
{
    // 153
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A number to check if it is armstrong or not");
        int num = sc.nextInt();

        int original = num;         // storing num in original
        int original_1 = num;       // storing num in original_1
        int count = 0;              //to count numbe rof digits in the number


        //this while is to count the numbe rof digits in the number by count++
        int i = 0;
        while(num !=0)
        {
            i = num %10;
            count ++;
            num = num/10;
        }
        System.out.println("Total number of digits in the number " + count);


        // this while is for the real calculation
        //extract the first digit
        //calculate the power using math.pow and count++
        //then adding power to the sum ( 153 = 1^3 + 5^3 + 3^3 )
        //moving on to the next number
        int sum = 0;
        int x;
        while(original_1 !=0)
        {
            x = original_1 % 10;
            int power = (int) Math.pow(x,count);
            sum = sum+power;
            original_1 = original_1 / 10;
        }

        // condition statement to verify if it is Armstrong or not
        // comparing the sum with the original variable
        if(sum==original)
        {
            System.out.println(sum + " is an Armstrong number");
        } else {
            System.out.println(sum + " is not an Armstrong number");
        }
    }
}
