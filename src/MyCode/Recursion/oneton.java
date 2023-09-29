// Print linearly from 1 to n

package MyCode.Recursion;

public class oneton {
    public static void main(String[] args) {
        int n = 5;
        fun(1,n);
    }
    public static void fun(int i, int n){
        if (i>n) return;
        System.out.println(i);
        fun(i+1, n);
    }
}
