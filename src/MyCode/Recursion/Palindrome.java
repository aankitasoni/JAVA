package MyCode.Recursion;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(fun(s,0));
    }
    public static boolean fun(String s, int i){
        int n = s.length();
        if (i >= n/2) return true;
        if(s.charAt(i) != s.charAt(n-i-1)) return false;

        return fun(s, i+1);
    }
}
