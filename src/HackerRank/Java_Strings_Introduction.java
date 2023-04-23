package HackerRank;
import java.util.*;
public class Java_Strings_Introduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(a.length() + b.length());
        if (a.compareTo(b) > 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String s1 = String.valueOf(a.charAt(0));
        String s2 = String.valueOf(b.charAt(0));
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();
        System.out.println(s1 +  a.substring(1) + " "+ s2 + b.substring(1));
    }
}