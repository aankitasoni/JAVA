package HackerRank;
import java.io.*;
import java.util.*;

public class Java_Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String a1 = a.toLowerCase();
        char[] c1 = a1.toCharArray();
        Arrays.sort(c1);
        String s1 = new String (c1);
        String b1 = b.toLowerCase();
        char[] c2 = b1.toCharArray();
        Arrays.sort(c2);
        String s2 = new String (c2);
        if (s1.equals(s2)){
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
