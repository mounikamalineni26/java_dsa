package java_dsa.Sorting;
import java.util.Scanner;

public class InsertionSort{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter number of Elements:");
        int n = sc.nextInt();
        
        int[] a = new int[n];
        System.out.print("Enter elements:");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        insertion(a);
        System.out.println("After Sorting:");
        for(int num: a){
            System.out.print(num + " ");
        }
        sc.close();
        
    }
    static void insertion(int[] a){
        int k = a.length;
        for(int i=0;i<k;i++){
            int key = a[i];
            int j = i-1;
            while(j>=0 && a[j]>key){
                a[j+1] = a[j];
                j = j-1;

            }
            a[j+1]= key;

        }

    }

}

/* 
Time Complexity:
Average/worst case: O(n2)
best case : O(1)
Space Complexity : O(1)
*/
    

