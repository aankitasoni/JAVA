package Dcoder;
import java.util.*;

public class Learning_Strings_and_Binary_Numbers {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if (a.contains(b) == true){
            System.out.println("1");
        } else if (b.contains(a)){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
