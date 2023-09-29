// Print name n times using recursion

package MyCode.Recursion;
import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun(1, n);
    }
    private static void fun(int i, int n) {
        if (i > n) return;
        System.out.println("Harsh");
        fun(i+1, n);
    }
}
