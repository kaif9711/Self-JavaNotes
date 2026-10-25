package Maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap_methods
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> hs = new HashMap<>();

        hs.put(101, "Kf");
        hs.put(102, "Kf1");
        hs.put(103, "Kf2"); // allowed

        System.out.println(hs.entrySet());



       //iterate only the keys
        Set key = hs.keySet();  // set because key must be uniqye
        for(Object k : key)
        {
            System.out.println(k);
        }

        //iterate only the values
       Collection val = hs.values();  // collection because values can be duplicate
        for(Object v : val )
        {
            System.out.println(v);
        }

        //iterating key-value pairs

        Set<Map.Entry<Integer, String>> entry = hs.entrySet(); // creates object that stores the set with both key-value pair of the map
        for(Map.Entry<Integer,String> k1 : entry) // creates an map.entry object to iterate in the set
        {
            System.out.println("key = " + k1.getKey() + " Value = " + k1.getValue() );
        }


    }
}
