package HackerEarth.BasicProgramming;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class PalindromicString {
    public static void main(String args[] ) throws Exception {
        boolean bl = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        for (int i =0; i<name.length(); i++){
            if (name.charAt(i) == name.charAt(name.length()-1-i)){
                continue;
            } else {
                bl = false;
            }
        }
        if (bl == true){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
