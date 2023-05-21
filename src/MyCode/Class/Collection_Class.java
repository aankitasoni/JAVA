package MyCode.Class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Collection Class == Used to find min/max/times element present
public class Collection_Class {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(9);
        al.add(72);
        al.add(87);
        al.add(1);
        al.add(11);

//        System.out.println("Min Element: " + Collections.min(al));
//        System.out.println("Max Element: " + Collections.max(al));
//        System.out.println(Collections.frequency(al, 9));

        Collections.sort(al);
        System.out.println(al);

        // Collections.sort(al, Comparator.reverseOrder()); == decreasing order
    }
}
