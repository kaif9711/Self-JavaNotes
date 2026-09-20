public class calculate_sum_standard_deviation
{
    public static void main(String[] args){
        int[] numbers = {8, 2, 6, 4, 3};
        int sum = 0;
        int sum_sq = 0;

        // With normal for loop
//        for (int i = 0; i<numbers.length; i++){
//            sum += numbers[i];
//            sum_sq += numbers[i] * numbers[i];
//        }

        //with Enhance for loop
        for (int num:numbers){
            sum += num;
            sum_sq += num  * num;
        }
        int lenght = numbers.length;
        double mean = (double)sum/lenght;
        double stdev = Math.sqrt((sum_sq)/lenght - mean*mean);

        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);
        System.out.println("Standard Deviation: " + stdev);



    }
}
