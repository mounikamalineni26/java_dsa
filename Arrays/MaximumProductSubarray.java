public class MaximumProductSubarray {
    public static int maxProduct(int[] arr){
        int n = arr.length;
        int maxprod = Integer.MIN_VALUE;
        int leftToRight = 1;
        int rightToLeft = 1;
        for(int i=0;i<n;i++){
            if(leftToRight ==0) leftToRight = 1;
            if(rightToLeft ==0) rightToLeft = 1;
            leftToRight *=arr[i];
            int j = n-i-1;
            rightToLeft *=arr[j];
            maxprod = Math.max(leftToRight,Math.max(rightToLeft,maxprod));

        }
        return maxprod;


    }
    public static void main(String[] args) {
        int[] arr ={-2,6,-3,-10,0,2};
        System.out.println(maxProduct(arr));
    }
}
