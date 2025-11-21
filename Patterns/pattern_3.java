package java_dsa.Patterns;
/*Output:

* * * * * 
* * * * 
* * * 
* * 
* 

 */

public class pattern_3 {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("*"+" ");       // decreased right-angled triangle
            }
            System.out.println();
        }
    }
    
}
