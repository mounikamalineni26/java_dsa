public class MaximumSumSubarray {
    public static int maxSubarraySum(int[] arr){
        int res = arr[0];
        int maxEnd = arr[0];
        for(int i=0;i<arr.length;i++){
            maxEnd = Math.max(maxEnd+arr[i],arr[i]);
            res = Math.max(res,maxEnd);
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr = {2,3,-8,7,-1,2,3};
        System.out.println(maxSubarraySum(arr));
    }
}
