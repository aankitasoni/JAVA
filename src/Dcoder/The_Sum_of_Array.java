package Dcoder;
import java.util.*;
public class The_Sum_of_Array {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int sum = 0;
        for (int i =0 ; i < n; i++ ) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        System.out.println(sum);
    }
}
