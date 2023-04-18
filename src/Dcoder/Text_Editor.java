package Dcoder;
import java.util.*;
public class Text_Editor {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            String s = sc.next();
            System.out.println(s.toUpperCase());
        }
    }
}
