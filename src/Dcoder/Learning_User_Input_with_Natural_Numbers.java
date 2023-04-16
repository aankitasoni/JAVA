package Dcoder;
import java.util.*;
public class Learning_User_Input_with_Natural_Numbers {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i =0; i<=n; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
