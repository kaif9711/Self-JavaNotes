public class missing_number
{
    public static void main(String[] args)
    {
        int[] number = {0, 1, 2, 4, 5};

        missing_number1 obj1 = new missing_number1();
        int result = obj1.missing(number);

        System.out.println("Missing number = " + result);

    }

}

class missing_number1
{
    public int missing(int[] nums)
    {

        for(int i=0; i<nums.length; i++)
        {
            boolean flag = false; //for flagging true for number found, false for number not found

            for(int j = 0; j<nums.length; j++)
            {
                if(i == nums[j])
                {
                    flag = true;
                    break;
                }
            }
            if(flag == false)
            {
                return i;
            }
        }
        return(nums.length);
    }

}
