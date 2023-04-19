package Dcoder;
import java.util.*;
public class Double_The_Number {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =0; i < n; i++){
            int a = sc.nextInt();
            int ar[] = new int[a];
            int k = sc.nextInt();
            int count = 0;
            for (int p = 0; p < ar.length; p++){
                ar[p] = sc.nextInt();
                if (ar[p] * 2 == k ){
                    count ++;
                }
            }
            System.out.println(count);
        }
    }
}
