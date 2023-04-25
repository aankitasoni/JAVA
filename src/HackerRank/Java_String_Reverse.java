package HackerRank;
import java.io.*;
import java.util.*;
public class Java_String_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean b  = true;
        for(int a = 0; a <= s.length()-1; a++){
            if(s.charAt(a) == s.charAt(s.length()-1-a)){
                continue;
            }
            else{
                b = false;
                break;
            }
        }
        if (b == true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
