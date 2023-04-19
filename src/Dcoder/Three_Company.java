package Dcoder;
import java.util.*;
public class Three_Company {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int p = sc.nextInt();
        for (int i =0; i < s.length(); i++){
            for (int a = 0; a < p ; a++){
                System.out.print(s.charAt(i));
            }
        }
    }
}