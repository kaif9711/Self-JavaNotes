package Strings_part2;

public class max_min_in_string
{
    public static void main(String[] args)
    {
        String s = "success";
        int[] arr = new int[256];

        char max_char = ' ';
        int max = -1;
        for(int i = 0; i<s.length(); i++)
        {
            arr[s.charAt(i)] = arr[s.charAt(i)] + 1;

        }

        for( int i = 0; i<s.length(); i++)
        {
            if(max < arr[s.charAt(i)])
            {
                max = arr[s.charAt(i)];
                max_char = s.charAt(i);
            }
        }

        System.out.println("Max repeated char is " + max_char + " and it repated " + max + " times");



    }

}
