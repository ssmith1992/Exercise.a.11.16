package Chapter11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Write a method called is1to1 that accepts a map whose keys and values are strings as its parameter and returns true if
no two keys map to the same value. For example, {Marty=206–9024, Hawking=123–4567, Smith=949–0504,
Newton=123–4567} should return false, but {Marty=206–9024, Hawking=555–1234, Smith=949–0504,
Newton=123–4567} should return true. The empty map is considered 1-to-1 and returns true.
 */
public class Exercise16 {
    //Write a method called is1to1 that accepts a map whose keys and values are strings as its parameter and returns true if
    //no two keys map to the same value. For example,{Marty=206–9024, Hawking=123–4567, Smith=949–0504,
    //Newton=123–4567} should return false, but {Marty=206–9024, Hawking=555–1234, Smith=949–0504,
    //Newton=123–4567} should return true. The empty map is considered 1-to-1 and returns true.

    public static void main(String[] args)
    {
        Map<String, String> map1 = new HashMap<>();
        map1.put("Marty", "206-9024");
        map1.put("Hawking", "123-4567");
        map1.put("Smith", "949-0504");
        map1.put("Newton", "123-4567");

        Map<String, String> map2 = new HashMap<>();
        map2.put("Marty", "206-9024");
        map2.put("Hawking", "555-1234");
        map2.put("Smith", "949-0504");
        map2.put("Newton", "123-4567");

        Exercise16 exercise16 = new Exercise16();
        System.out.println(exercise16.is1to1(map1));
        System.out.println(exercise16.is1to1(map2));
    }

    private boolean is1to1(Map<String, String> map)
    {
        if (map.size() == 0) return true;
        else
        {
            Set<String> set = new HashSet<>(map.values());

            return  (set.size() >= map.size());
        }
    }
}
