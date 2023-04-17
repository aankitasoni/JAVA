package Dcoder;
import java.util.*;
public class The_BlackJack_with_Conditions {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        if (sum > 21){
            if (a == 11){
                a = 1;
                System.out.println(a+b);
            } else if (b == 11){
                b = 1;
                System.out.println(a+b);
            } else if (a == 11 && 11 == b){
                System.out.println("2");
            } else {
                System.out.println("0");
            }
        } else {
            System.out.println(a+b);
        }
    }
}
