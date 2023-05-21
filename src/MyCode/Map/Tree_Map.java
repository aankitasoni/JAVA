package MyCode.Map;

// Tree Map == sort on the basis of key

import java.util.Map;
import java.util.TreeMap;

public class Tree_Map {
    public static void main(String[] args) {
        Map<String, Integer> mp = new TreeMap<>();
        mp.put("One ", 1);
        mp.put("Two ", 2);
        mp.put("Three " , 3);
        mp.put("Four ", 4);
        mp.put("Five " , 5);

        mp.remove("Three ");
        System.out.println(mp);


    }
}
