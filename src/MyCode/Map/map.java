package MyCode.Map;

// MAP = unique key value -- if 2 times, update it

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<String, Integer>  m = new HashMap<>();
        m.put("One ", 1);
        m.put("Two ", 2);
        m.put("Three " , 3);
        m.put("Four ", 4);
        m.put("Five " , 5);

        System.out.println(m);
/*
containsKey() == contains value or not
        if (!m.containsKey("Two ")){
            m.put("Two ", 28);
        }

        // putIfAbsent == Satisfy if condition

        m.putIfAbsent("Two ", 23);
*/

        System.out.println(m.containsValue(3));
        System.out.println(m.isEmpty());

        // Iterate in Map -  2 types:
        // 1.Entry class there, elements keep adding inside it

        for (Map.Entry<String, Integer> e: m.entrySet()){
            System.out.println(e);

            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // m.keyset() == only return key set value
        for (String key: m.keySet()){
            System.out.println(key);
        }
        for (Integer value: m.values()){
            System.out.println(value);
        }
    }
}
