package MyCode.Recursion;

public class sum {
    public static void main(String[] args) {
        sum(5);
        sum(7);
    }
    public static void sum(int n){
        int p = 0;
        for (int i =1; i<=n; i++){
            p += i;
        }
        System.out.println(p);
    }
}


//public class sum {
//    public static void main(String[] args) {
//        int n = 5;
//        System.out.println(sum(n));
//    }
//    public static int sum(int n){
//        if (n == 0) return 0;
//        return (n + sum(n-1));
//    }
//}
