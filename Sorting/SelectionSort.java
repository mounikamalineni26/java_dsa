package java_dsa.Sorting;
import java.util.Scanner;

public class SelectionSort {
    static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int mini = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[mini]){
                    mini = j;
                }
            }
            int  temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter number of Elements:");
        int n = sc.nextInt();
        
        int[] a = new int[n];
        System.out.print("Enter elements:");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        selectionSort(a);
        System.out.println("After Sorting:");
        for(int num: a){
            System.out.print(num + " ");
        }
        sc.close();
        
    }
}

/*
Time Complexity: O(n2)
Space Complexity: O(1)
 */
