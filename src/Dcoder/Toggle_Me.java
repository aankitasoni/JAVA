package Dcoder;
import java.util.*;
public class Toggle_Me {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String add = "";
        for (int i = 0;  i < s.length(); i++){
            String p = String.valueOf(s.charAt(i));
            String a = p.toUpperCase();
            String b = p.toLowerCase();
            if ( p == a){
                add += b;
            } else {
                add += a;
            }
        }
        System.out.println(add);
    }
}
