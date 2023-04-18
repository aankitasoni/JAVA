package Dcoder;
import java.util.*;
public class String_Matching {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++){
            String s = sc.next();
            String p = sc.next();
            if (s.contains(p)){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
