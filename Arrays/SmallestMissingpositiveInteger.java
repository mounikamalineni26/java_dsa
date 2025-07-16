public class SmallestMissingpositiveInteger {
    public static int partition(int[] arr){
        int pivot = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                int temp=arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
                pivot++;
            }
        }
        return pivot;
    }
    public static int missingNumber(int[] arr){
        int k = partition(arr);
        for(int i=0;i<k;i++){
            int val = Math.abs(arr[i]);
            if(val-1<k && arr[val-1]>0){
                arr[val-1] = -arr[val-1];
            }
        }
        for(int i=0;i<k;i++){
            if(arr[i]>0){
                return i+1;
            }
        }
        return k+1;

    }
    public static void main(String[] args){
        int[] arr = {2,-3,4,1,1,7};
        System.out.println(missingNumber(arr));
    }
}
