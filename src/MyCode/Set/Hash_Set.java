package MyCode.Set;

import java.util.HashSet;
import java.util.Set;

// Hash Set == Print order in random order

public class Hash_Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(36);
        set.add(3);
        set.add(56);
        set.add(19);
        set.add(85);
        set.add(56);

        System.out.println(set);
        set.remove(3);
        System.out.println(set);
        System.out.println(set.contains(56));

        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
    }
}
