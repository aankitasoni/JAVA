package Dcoder;
import java.util.*;
public class Rotate_Array {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        int p = sc.nextInt();
        for (int i = 0; i < n; i++){
            al.add(sc.nextInt());
        }
        for (int i = 0; i<p; i++){
            int b = al.get(al.size()-1);
            al.remove(al.size()-1);
            al.add(0,b);
        }
        for (int i : al){
            System.out.print(i + " ");
        }
    }
}
