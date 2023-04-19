package Dcoder;
import java.util.*;
public class Avik_and_his_Girlfriend_Necklace {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i <n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for( int p : a){
            System.out.print(p + " ");
        }
    }
}
