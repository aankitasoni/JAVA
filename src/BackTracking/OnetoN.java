// print from 1 to n without using +

package BackTracking;

public class OnetoN {
    public static void main(String[] args) {
        int n = 5;
        fun(n, n);
    }
    public static void fun(int i, int n){
        if (i < 1) return;
        fun(i-1, n);
        System.out.println(i);

    }
}
