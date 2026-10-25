package Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps
{
    public static void main(String[] args)
    {

        HashMap<Integer, String> hs0 = new HashMap<>();
        // HashMap<Integer, String> hm = new HashMap<>();
        hs0.put(001, "max");
        hs0.put(002, "candy");

        HashMap<Integer, String> hs = new HashMap<>();
        // HashMap<Integer, String> hm = new HashMap<>();
        hs.put(101, "Kf");      //void put() Adds a key-value pair.
        hs.put(102, "Kf1");
        hs.put(103, "Kf2");
        hs.put(104, "Kf3");

       hs.putAll(hs0);          // Adds all mappings from another Map.
       System.out.println(hs);

       System.out.println(hs.get(103)); //Returns the value associated with a key.
        System.out.println(hs.getOrDefault(104, "unknown")); //Returns the value if the key exists; otherwise returns the specified default value.
        hs.remove(102); // void | Removes a mapping using its key.
        hs.remove(101, "kf"); //Removes the mapping only if both key and value match.
        System.out.println(hs.containsKey(101)); //Checks whether a particular key exists.
        System.out.println(hs.containsValue("kf2")); //Checks whether a particular value exists.
        System.out.println(hs.size()); // Returns the number of key-value mappings.
        System.out.println(hs.isEmpty()); //Checks whether the Map contains no mappings.
//        hs.clear(); // void | Removes all key-value mappings.

        // Important Map Collection-View Methods //

        Set key = hs.keySet(); //keySet() | Returns all the keys as a Set. // keySet() returns a Set because keys are unique.
        System.out.println(key);

        Collection value = hs.values(); //values() | Returns all the values as a Collection. values() returns a Collection because values can be duplicated.
        System.out.println(value);

        hs.replace(103, "Mohammad Kaif ");      //
        System.out.println(hs);


         }
}
