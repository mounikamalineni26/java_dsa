public class MaxCircularSumSubarray {
    public static int maxiSum(int[] arr){
        int currMax =0,currMin=0;
        int maxSum =arr[0],minSum = arr[0];
        int totalSum=0;
        for(int i=0;i<arr.length;i++){
            currMax = Math.max(currMax+arr[i],arr[i]);
            maxSum = Math.max(maxSum,currMax);
            currMin = Math.min(currMin+arr[i],arr[i]);
            minSum = Math.min(minSum,currMin);
            totalSum+=arr[i];
        }
        int normalSum = maxSum;
        int circularSum = totalSum-minSum;
        if(minSum == totalSum){
            return normalSum;
        }
        return Math.max(normalSum,circularSum);
    }
    public static void main(String[] args){
        int[] arr = {10,-3,-4,7,6,5,-4,-1};
        System.out.println(maxiSum(arr));
    }
}
