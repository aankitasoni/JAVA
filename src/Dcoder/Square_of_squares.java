package Dcoder;
import java.util.*;
public class Square_of_squares {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        double d = Math.sqrt(n);
        int p = (int)d;
        if(d == p){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
