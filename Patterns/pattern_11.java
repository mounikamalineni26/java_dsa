package java_dsa.Patterns;
/*output:
*             * 
* *         * *
* * *     * * *
* * * * * * * *
* * * * * * * *
* * *     * * *
* *         * *
*             *
 
*/

public class pattern_11 {
    public static void main(String[] args){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int j=1;j<=2*(n-i);j++)
                System.out.print(" "+" ");
            for(int j=1;j<=i;j++){                       //upper half
                System.out.print("*"+" ");
            }
            System.out.println();
        }
         for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int j=1;j<=2*(n-i);j++)
                System.out.print(" "+" ");
            for(int j=1;j<=i;j++){                       //lower half
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        
    }

    
}
