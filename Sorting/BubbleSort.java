package java_dsa.Sorting;
import java.util.Scanner;

public class BubbleSort{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter number of Elements:");
        int n = sc.nextInt();
        
        int[] a = new int[n];
        System.out.print("Enter elements:");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        bubble(a);
        System.out.println("After Sorting:");
        for(int num: a){
            System.out.print(num + " ");
        }
        sc.close();
        
    }
    static void bubble(int[] a){
        int k = a.length;
        for(int i=0;i<k-1;i++){
            for(int j=0;j<k-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]  = a[j+1];
                    a[j+1] = temp;
                }
            }

        }

    }

}


/* 
Time Complexity:O(n2)
Space Complexity : O(1)
*/
    

