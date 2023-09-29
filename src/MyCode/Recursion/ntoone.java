package MyCode.Recursion;

public class ntoone {
    public static void main(String[] args) {
        int n =5;
        fun(n,n);
    }
    public static void fun(int i, int n){
        if (i < 1) return;
        System.out.println(i);
        fun(i-1, n);
    }
}
