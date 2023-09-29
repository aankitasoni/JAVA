// print from n to 1 without using -

package BackTracking;

public class NtoOne {
    public static void main(String[] args) {
        int n = 5;
        fun(1,n);
    }
    public static void fun (int i, int n){
        if (i > n) return;
        fun(i+1, n);
        System.out.println(i);
    }
}
