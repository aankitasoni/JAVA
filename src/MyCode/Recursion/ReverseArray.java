package MyCode.Recursion;

public class ReverseArray {
    public static void main(String[] args) {
        int n = 5;
       int arr[] = {1,4,5,6,7};
       reverse(arr, n);
    }
    public static void reverse(int arr[] , int n){
        int p1=0, p2 =n-1;
        while(p1 < p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
        print(arr, n);
    }
    public static void print(int arr[], int n){
        for (int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
