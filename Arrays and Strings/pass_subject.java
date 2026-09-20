public class pass_subject
{
    public static void main(String[] args){
        int[] marks = {45, 72, 33, 81, 29, 65, 90};
        int count = 0;
        for(int num : marks){
            if (num>=40){
                count++;
            }

        }
        System.out.print("Number of student passed " + count);


    }
}
