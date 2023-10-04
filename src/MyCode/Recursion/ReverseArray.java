package MyCode.Recursion;

public class ReverseArray {
    public static void main(String[] args) {
        int n = 5;
       int arr[] = {1,4,5,6,7};
       reverse(arr, n);
    }
    public static void reverse(int arr[] , int n){
        int rev[] = new int[n];
        for (int i =n-1; i>=0; i--){
            rev[n-i-1] = arr[i];
        }
        print(rev, n);
    }
    public static void print(int rev[], int n){
        for (int i =0; i<n; i++){
            System.out.print(rev[i] + " ");
        }
    }
}
