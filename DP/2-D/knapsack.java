public class Knapsack {

    // Corrected method name
    public int solveKnapsack(int W, int[] wt, int[] val, int n) {
        int[][] dp = new int[n+1][W+1];

        for(int i = 1; i <= n; i++){
            for(int w = 1; w <= W; w++){
                if(wt[i-1] <= w){
                    dp[i][w] = Math.max(
                        dp[i-1][w],
                        val[i-1] + dp[i-1][w - wt[i-1]]
                    );
                } else {
                    dp[i][w] = dp[i-1][w];
                }
            }
        }

        return dp[n][W];
    }

    public static void main(String[] args) {
        int W = 5;                  
        int[] wt = {1, 2, 3};       
        int[] val = {10, 20, 30};   
        int n = wt.length;           

        Knapsack ks = new Knapsack();
        int maxValue = ks.solveKnapsack(W, wt, val, n);

        System.out.println("Maximum value in knapsack = " + maxValue);
    }
}
