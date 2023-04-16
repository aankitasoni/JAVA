package Dcoder;
import java.util.*;
public class Learning_Prime_Numbers_with_Loop_Recursion {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m  = sc.nextInt();
        int n = sc.nextInt();
        for (int i = m; i <= n; i++){
            if (i == 1){
                continue;
            } else {
                boolean b = true;
                for (int a = 2; a < i; a++){
                    if (i % a == 0 ){
                        b = false;
                        break;
                    } else {
                        continue;
                    }
                }
                if(b == true){
                    System.out.println(i);
                }
            }
        }
    }
}
