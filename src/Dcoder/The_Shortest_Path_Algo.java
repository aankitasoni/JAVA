package Dcoder;
import java.util.*;

public class The_Shortest_Path_Algo {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        double d1 = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        double d2 = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        if (d1 > d2){
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }
}
