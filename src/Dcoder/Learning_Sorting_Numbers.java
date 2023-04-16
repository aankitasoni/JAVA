package Dcoder;
import java.util.*;
public class Learning_Sorting_Numbers {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m[] = new int[3];
        for (int i = 0; i < m.length; i++){
            m[i] = sc.nextInt();
        }
        Arrays.sort(m);
        for (int i : m){
            System.out.print(i + " ");
        }
    }
}
