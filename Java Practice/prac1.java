import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.*;

public class prac1
{

    public static void main(String[] args)
    {
        int[] arr = {4, 5, 1, 2, 1, 4, 5};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n : arr)
        {
            map.put(n, map.getOrDefault(n, 0)+ 1);
        }

        for( int n : arr)
        {
            if(map.get(n) == 1)
            {
                System.out.println(n);
                break;
            }
        }
    }
}
