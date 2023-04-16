package Dcoder;
import java.util.*;

public class Reverse_Me {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        String rs = "";
        for (int i = s.length()-1; i >= 0; i--){
            int p = Integer.parseInt(String.valueOf(s.charAt(i)));
            rs += p;
        }
        System.out.println(Integer.parseInt(rs));
    }
}
