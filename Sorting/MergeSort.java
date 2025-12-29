package java_dsa.Sorting;
import java.util.Scanner;

public class MergeSort{
    public static void mergesort(int[] arr,int l,int r){
        if(l<r){
            int mid = (l+r)/2;
            mergesort(arr,l,mid);
            mergesort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
    public static void merge(int[] arr, int l, int mid, int r){
        int n1 = mid-l+1;
        int n2 = r-mid;

        int[] l1 = new int[n1];
        int[] l2 = new int[n2];

        for(int i=0;i<n1;++i){
            l1[i] = arr[l+i];

        }
        for(int j=0;j<n2;++j){
            l2[j] = arr[mid+1+j];
        }

        int i=0,j=0;
        int k = l;
        while(i<n1 && j<n2){
            if(l1[i]<=l2[j]){
                arr[k] = l1[i];
                i++;
            }else{
                arr[k] = l2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = l1[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k] = l2[j];
            j++;
            k++;
        }


    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter number of Elements:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.print("Enter elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        mergesort(arr,0,n-1);
        System.out.println("After Sorting:");
        for(int num: arr){
            System.out.print(num + " ");
        }
        sc.close();
    }

}
// Time Complexity: O(n log n)
// Space Complexity: O(n)
