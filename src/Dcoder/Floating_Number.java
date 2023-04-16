package Dcoder;
import java.util.*;
public class Floating_Number {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            double p = sc.nextDouble();
            String s = String.format("%.2f" , p);
            System.out.println(s);
        }
    }
}
