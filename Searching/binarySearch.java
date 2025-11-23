package java_dsa.Searching;
import java.util.*;

public class binarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int result = binary(a,key);
        if(result==-1)System.out.print("Element not found");
        else  System.out.println("Element found at index: " + result);
        sc.close();
    }
    public static int binary(int arr[], int k){
        int l=0;
        int r = arr.length -1;
        while(l<=r){
            int mid = l+(r-l) /2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]>k){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return -1;
    }
}

/*time complexity = O(logn)
space complexity = O(1)*/
