import java.util.Scanner;

public class find_duplicates
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght if the array");
        int n = sc.nextInt();
        int[] num = new int[n];

        for(int i = 0; i<num.length; i++){
            num[i] = sc.nextInt();
        }
        int result = count_duplicates(num);
        System.out.println("Duplicates are " + count_duplicates(num));

    }


    public static int count_duplicates(int[] arr){
        int count = 0;
        for(int i= 0; i<arr.length; i++){
            for(int j = (i+1); j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    break;
                }
            }

        }
        return count;
    }

}
