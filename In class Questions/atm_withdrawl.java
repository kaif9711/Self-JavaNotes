//ATM Withdrawal — Java Practice Question
//
//        Write a Java program to simulate an ATM withdrawal using nested if statements.
//
//        The program should:
//
//        Ask the user to enter their PIN.
//        Check whether the PIN is correct.
//        If the PIN is correct, check the current account balance.
//        Ask the user for the withdrawal amount.
//        Check whether the balance is sufficient for the withdrawal.
//        If the balance is sufficient, check whether the withdrawal amount is a multiple of ₹100.
//        If all conditions are satisfied, display "Withdrawal successful".
//        Otherwise, display an appropriate message explaining why the withdrawal failed.
//
//        Example:
//
//        Enter PIN: 1234
//        Enter withdrawal amount: 500
//
//        Withdrawal successful
//
//        This is a good practice question for nested if-else conditions.



import java.util.Scanner;

public class atm_withdrawl
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the PIN");

        int original_pin = 1234;
        int balance = 56000;
        int pin = sc.nextInt();

        if (pin == original_pin)
        {
            System.out.println("Current balance: " + balance);
            System.out.println("Enter the withdrawal amount");

            int withdrawal = sc.nextInt();

            if (withdrawal <= balance)
            {
                if (withdrawal % 100 == 0)
                {
                    System.out.println("Withdraw successfull");

                }
                else
                {
                    System.out.println("Amount is not a multiple of 100");
                }
            }
            else
            {
                System.out.println("Insufficient balance");
            }
        }
        else
        {
            System.out.println("PIN is wrong");
        }
    }
}
