package HackerRank;
import java.util.*;
public class Java_Loops_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++){
            int p = n * i;
            System.out.println(n + " x " + i + " = " + p);
        }
    }
}
