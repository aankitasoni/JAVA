package Dcoder;
import java.util.*;
public class Sum_of_Squares {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double d = 0;
        for (int i = a; i <= b; i++){
            d +=  Math.pow(i, 2);
        }
        System.out.println((int)d);
    }
}
