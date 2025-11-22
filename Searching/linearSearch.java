package java_dsa.Searching;
import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        boolean flag = false;
        for(int i=0;i<n;i++){
            if(a[i]==key){
                flag = true;
            }
        }
        if(flag){
            System.out.println("Element is found");
        }
        else System.out.println("Element not found");

       sc.close();
    }
    
}
